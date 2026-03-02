package dsa.recursion;

public class Digits {
    static class DigitsInternal {
        private int countDigits(int n, int placeValue) {
            if (n < 1) {
                return placeValue;
            }

            return countDigits(n / 10, placeValue + 1);
        }
    }

    int placeValue = 0;
    DigitsInternal instance = new DigitsInternal();

    public int countDigits(int n) {
        if (n == 0) {
            return 1;
        }

        return instance.countDigits(n, placeValue);
    }
}


