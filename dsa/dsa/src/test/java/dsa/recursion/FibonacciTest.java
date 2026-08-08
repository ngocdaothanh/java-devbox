package dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void returnsTenthFibonacciNumber() {
        Fibonacci instance = new Fibonacci();
        assertEquals(55, instance.fibonacci(10));
    }
}
