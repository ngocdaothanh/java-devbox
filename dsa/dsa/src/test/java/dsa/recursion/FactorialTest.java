package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class FactorialTest {
    @Test
    void biggerThan1() {
        Factorial instance = new Factorial();
        assertEquals(120, instance.factorial(5));
    }

    @Test
    void throwsErrorForNegativeNumber() {
        Factorial instance = new Factorial();
        assertThrowsExactly(Factorial.NegativeNumberGivenException.class, () -> instance.factorial(-1));
    }

    @Test
    void factorialOf0() {
        Factorial instance = new Factorial();
        assertEquals(1, instance.factorial(0));
    }

    @Test
    void factorialOf1() {
        Factorial instance = new Factorial();
        assertEquals(1, instance.factorial(1));
    }
}