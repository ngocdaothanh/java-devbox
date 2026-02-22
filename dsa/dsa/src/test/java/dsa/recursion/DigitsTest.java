package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsTest {
    @Test
    void countDigits() {
        Digits instance = new Digits();

        assertEquals(2, instance.countDigits(99));
    }
}