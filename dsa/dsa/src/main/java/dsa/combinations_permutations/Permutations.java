package dsa.combinations_permutations;

public class Permutations {
    public static void main(String[] args) {
        printPairs(5);
    }

    public static void printPairs(int n) {
        int numOfPairs = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    System.out.println(i + ", " + j);
                    numOfPairs++;
                }
            }
        }

        System.out.println(numOfPairs);
    }
}
