package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q013RomanToIntegerTest {
    @Test
    void smallNumberIsNotBeforeBigNumber() {
        Q013RomanToInteger instance = new Q013RomanToInteger();
        int res = instance.romanToInt("XII");
        assertEquals(12, res);
    }

    @Test
    void smallNumberIsBeforeBigNumber() {
        Q013RomanToInteger instance = new Q013RomanToInteger();
        int res = instance.romanToInt("IV");
        assertEquals(4, res);
    }
}
