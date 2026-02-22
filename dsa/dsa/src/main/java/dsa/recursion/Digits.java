package dsa.recursion;

public class Digits {
    static class DigitsInternal {
        public int countDigitsInternal(int n, int placeValue) {
            if (n < 1) {
                return placeValue;
            }

            return countDigitsInternal(n / 10, placeValue + 1);
        }
    }

    int placeValue = 0;
    DigitsInternal instance = new DigitsInternal();

    public int countDigits(int n) {
        if (n == 0) {
            return 1;
        }

        return instance.countDigitsInternal(n, placeValue);
    }
}


