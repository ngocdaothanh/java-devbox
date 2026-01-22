package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q020ValidParenthesesTest {

    @Test
    void isValid() {
        Q020ValidParentheses instance = new Q020ValidParentheses();
        assertTrue(instance.isValid("[]{}()"));
        assertFalse(instance.isValid("[]{(})"));
    }
}