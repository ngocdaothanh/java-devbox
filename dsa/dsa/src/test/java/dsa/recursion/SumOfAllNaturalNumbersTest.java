package dsa.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumOfAllNaturalNumbersTest {
    @Test
    void throwExceptionWhenNegativeNumberIsGiven() {
        SumOfAllNaturalNumbers instance = new SumOfAllNaturalNumbers();
        assertThrows(IllegalArgumentException.class, () -> instance.sumOfAllNaturalNumbers(-2));
    }

    @Test
    void sumUpTo0() {
        SumOfAllNaturalNumbers instance = new SumOfAllNaturalNumbers();
        assertEquals(0, instance.sumOfAllNaturalNumbers(0));
    }

    @Test
    void sumUpTo1() {
        SumOfAllNaturalNumbers instance = new SumOfAllNaturalNumbers();
        assertEquals(1, instance.sumOfAllNaturalNumbers(1));
    }

    @Test
    void sumUpTo3() {
        SumOfAllNaturalNumbers instance = new SumOfAllNaturalNumbers();
        assertEquals(6, instance.sumOfAllNaturalNumbers(3));
    }
}
