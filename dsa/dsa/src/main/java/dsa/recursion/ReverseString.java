package dsa.recursion;

public class ReverseString {
    public String reverseString(String s) {
        if (s.length() <= 1) {
            return s;
        }

        return reverseString(s, String.valueOf(s.charAt(s.length() - 1)), s.length() - 2);
    }

    private String reverseString(String s, String sumOfChar, int point) {
        if (point <= 0) {
            return sumOfChar + s.charAt(point);
        }

        return reverseString(s, sumOfChar + s.charAt(point), point - 1);
    }
}
