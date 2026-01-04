package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Q009PalidromeNumberTest {
    @Test
    void isPalindrome() {
        Q009PalidromeNumber instance = new Q009PalidromeNumber();
        assertTrue(instance.isPalindrome(121));
    }

    @Test
    void isNotPalindrome() {
        Q009PalidromeNumber instance = new Q009PalidromeNumber();
        assertFalse(instance.isPalindrome(-121));
    }
}
