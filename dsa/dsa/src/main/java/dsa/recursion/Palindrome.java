package dsa.recursion;

public class Palindrome {
    boolean palindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        //return palindromeKeepingTheOriginalString(s, 0, s.length() - 1);
        return palindromeBuildingSmallerString(s);
    }

    private boolean palindromeKeepingTheOriginalString(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return palindromeKeepingTheOriginalString(s, left + 1, right - 1);
    }

    private boolean palindromeBuildingSmallerString(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }

        char fistChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);
        if (fistChar != lastChar) {
            return false;
        }

        String smallerString = s.substring(1, s.length() - 1);
        return palindromeBuildingSmallerString(smallerString);
    }
}
