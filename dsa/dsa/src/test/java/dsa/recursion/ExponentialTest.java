package dsa.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExponentialTest {
    @Test
    void correct() {
        Exponential instance = new Exponential();
        assertEquals(27, instance.exponential(3, 3));
    }

    @Test
    void exponentialOf0ShouldBe1() {
        Exponential instance = new Exponential();
        assertEquals(1, instance.exponential(0, 0));
    }

    @Test
    void negativeExponentialShouldThrowException() {
        Exponential instance = new Exponential();
        assertThrows(
                Exponential.NegativeNumberExponentialGiven.class,
                () -> instance.exponential(5, -5)
        );
    }
}
