package leetcode;

import java.util.HashMap;
import java.util.Map;

class Q013RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        for (int character = 0; character < s.length(); character++) {
            int currentChar = romanMap.get(s.charAt(character));

            if (character + 1 < s.length() && currentChar < romanMap.get(s.charAt(character + 1))) {
                sum -= currentChar;
            } else {
                sum += currentChar;
            }
        }

        return sum;
    }
}
