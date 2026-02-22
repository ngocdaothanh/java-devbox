package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void lengthIs0() {
        ReverseString instance = new ReverseString();
        assertEquals("", instance.reverseString(""));
    }

    @Test
    void lengthIs1() {
        ReverseString instance = new ReverseString();
        assertEquals("c", instance.reverseString("c"));
    }

    @Test
    void shouldReturnReversedString() {
        ReverseString instance = new ReverseString();
        assertEquals("cba", instance.reverseString("abc"));
    }

    @Test
    void palindrome() {
        ReverseString instance = new ReverseString();
        assertEquals("tacocat", instance.reverseString("tacocat"));
    }
}
