package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void largerThanAFib() {
        Fibonacci instance = new Fibonacci();
        assertEquals(616, instance.fibonacci(10));
    }
}