package dsa.recursion;

public class Factorial {
    static class NegativeNumberGivenException extends RuntimeException {}

    int factorial(int n) {
        if (n < 0) {
            throw new NegativeNumberGivenException();
        }

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
