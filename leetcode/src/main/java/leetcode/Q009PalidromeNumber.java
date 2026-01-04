package leetcode;

class Q009PalidromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder preReverse = new StringBuilder(str);

        StringBuilder builder = preReverse.reverse();
        String reversedStr = builder.toString();

        return str.equals(reversedStr);
    }
}

