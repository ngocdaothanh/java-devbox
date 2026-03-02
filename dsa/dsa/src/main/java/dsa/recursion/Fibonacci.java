package dsa.recursion;

public class Fibonacci {
    public int fibonacci(int n) {
        return fibonacci(n, 0, 0, 1, 0);
    }

    private int fibonacci(int n, int c, int a, int b, int count) {
        if (n <= 1) {
            return n;
        }

        if (count >= n) {
            return b + a;
        }

        return fibonacci(n, b + a, b, c, count + 1);
    }
}
