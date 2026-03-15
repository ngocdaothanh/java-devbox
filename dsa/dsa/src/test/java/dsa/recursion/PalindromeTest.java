package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void emptyStringShouldBePalindrome() {
        Palindrome instance = new Palindrome();
        assertTrue(instance.palindrome(""));
    }

    @Test
    void stringOfOneCharShouldBePalindrome() {
        Palindrome instance = new Palindrome();
        assertTrue(instance.palindrome("a"));
    }

    @Test
    void palindromeOfOddNumberOfCharsShouldBePalindrome() {
        Palindrome instance = new Palindrome();
        assertTrue(instance.palindrome("tacocat"));
    }

    @Test
    void palindromeOfEvenNumberOfCharsShouldBePalindrome() {
        Palindrome instance = new Palindrome();
        assertTrue(instance.palindrome("taccat"));
    }
}