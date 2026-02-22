package dsa.recursion;

public class Exponential {
    static class NegativeNumberExponentialGiven extends RuntimeException {}

    int exponential(int base, int exp) throws NegativeNumberExponentialGiven {
        if (exp < 0) {
            throw new NegativeNumberExponentialGiven();
        }

        if (exp == 0) {
            System.out.println(1);
            return 1;
        }

        if (exp == 1) {
            System.out.println(base);
            return base;
        }

        return base * exponential(base, exp - 1);
    }
}
