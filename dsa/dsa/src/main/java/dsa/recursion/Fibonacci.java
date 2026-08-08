package dsa.recursion;

public class Fibonacci {
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        return fibonacci(n, 0, 1);
    }

    private int fibonacci(int n, int current, int next) {
        if (n == 0) {
            return current;
        }
        return fibonacci(n - 1, next, current + next);
    }
}
