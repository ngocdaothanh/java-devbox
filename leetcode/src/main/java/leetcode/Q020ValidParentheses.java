package leetcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Q020ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> MatchingPair = new HashMap<>();
        MatchingPair.put('}','{');
        MatchingPair.put(')','(');
        MatchingPair.put(']','[');

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (MatchingPair.containsKey(c)) {
                if (!stack.isEmpty() || stack.peek() == c) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
