package dsa.recursion;


public class Countdown {
    String f(int n) {
        if (n <= 1) {
            System.out.println(n);
            return "blastoff!!";
        }
        System.out.println(n);
        return f(n - 1);
    }
}
