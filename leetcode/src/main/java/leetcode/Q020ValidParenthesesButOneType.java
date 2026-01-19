package leetcode;

public class Q020ValidParenthesesButOneType {
    public boolean isValid(String s) {
        int sum = 0;  // Sum of open parentheses

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                sum += 1;
            }
            if (currentChar == ')') {
                sum -= 1;
            }

            if (sum < 0) {
                return false;
            }
        }

        return sum == 0; // Balanced
    }
}
