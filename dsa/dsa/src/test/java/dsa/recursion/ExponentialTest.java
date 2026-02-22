package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExponentialTest {
    @Test
    void correct() throws Exponential.NegativeNumberExponentialGiven {
        Exponential instance = new Exponential();

        assertEquals(27, instance.f(3, 3));
    }

    @Test
    void incorrect() throws Exponential.NegativeNumberExponentialGiven {
        Exponential instance = new Exponential();

        assertEquals(1, instance.f(20, 3));
    }

    @Test
    void zeroInstance() throws Exponential.NegativeNumberExponentialGiven {
        Exponential instance = new Exponential();

        assertEquals(1, instance.f(999, 0));
    }

    @Test
    void negativeNum() throws Exponential.NegativeNumberExponentialGiven {
        Exponential instance = new Exponential();

        assertEquals(625, instance.f(-5, 4));
    }
}