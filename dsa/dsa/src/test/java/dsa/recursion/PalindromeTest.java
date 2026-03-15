package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome instance = new Palindrome();
        assertTrue(instance.palindrome("tacocat"));
    }

    @Test
    void Palindrome() {
        Palindrome instance = new Palindrome();
        assertTrue(instance.palindrome("racecar"));
    }
}