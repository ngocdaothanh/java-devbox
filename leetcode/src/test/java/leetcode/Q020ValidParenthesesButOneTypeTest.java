package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q020ValidParenthesesButOneTypeTest {
    @Test
    void isValid() {
        Q020ValidParenthesesButOneType instance = new Q020ValidParenthesesButOneType();
        assertTrue(instance.isValid("()()(())"));
    }

    @Test
    void isInvalidDuringTheProcess() {
        Q020ValidParenthesesButOneType instance = new Q020ValidParenthesesButOneType();
        assertFalse(instance.isValid("())()(())"));
    }

    @Test
    void isInvalidAtTheEndPositiveSum() {
        Q020ValidParenthesesButOneType instance = new Q020ValidParenthesesButOneType();
        assertFalse(instance.isValid("()()(())("));
    }

    @Test
    void isInvalidAtTheEndNegativeSum() {
        Q020ValidParenthesesButOneType instance = new Q020ValidParenthesesButOneType();
        assertFalse(instance.isValid("()()(()))"));
    }
}