package dsa.recursion;

public class Exponential {
    static class NegativeNumberExponentialGiven extends Throwable {}

    int f(int base, int exp) throws NegativeNumberExponentialGiven {
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

        return base * f(base, exp - 1);
    }
}
