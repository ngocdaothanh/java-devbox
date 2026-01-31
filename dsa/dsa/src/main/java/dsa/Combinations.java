package dsa;

public class Combinations {
    public static void main(String[] args) {
        printPairs(5);
    }

    /**
     * Given numbers from 1 to n (n > 1),
     * prints all the pairs.
     * <p>
     * Notes:
     * - The number of pairs is: n * (n - 1) / 2
     * - The order is not important.
     */
    public static void printPairs(int n) {
        int numOfPairs = 0;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(i + ", " + j);
                numOfPairs++;
            }
        }

        System.out.println("Number of pairs: " + numOfPairs);
    }
}