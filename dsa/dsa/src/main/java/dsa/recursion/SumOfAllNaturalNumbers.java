package dsa.recursion;

public class SumOfAllNaturalNumbers {
    int sumOfAllNaturalNumbers(int n) throws IllegalArgumentException{
        if (n < 0) {
            throw new IllegalArgumentException("Input number cannot be negative");
        }

        return sumOfAllNaturalNumbers(n, 0);
    }

    private int sumOfAllNaturalNumbers(int n, int sum) {
        if (n <= 1) {
            System.out.println(sum);
            return sum + n;
        }

        return sumOfAllNaturalNumbers(n - 1, sum + n);
    }
}
