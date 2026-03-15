package dsa.recursion;

public class Palindrome {
    boolean palindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        return palindrome(s, 0, s.length() - 1);
    }

    private boolean palindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return palindrome(s, left + 1, right - 1);
    }
}
