public class StringExample {
    // Reverse a string.
    public static void main(String[] args) {
        String originalString = "originalString";
        StringBuilder preReverse = new StringBuilder(originalString);

        StringBuilder builder = preReverse.reverse();
        String reversedStr = builder.toString();

        System.out.println("originalString: " + originalString);
        System.out.println("reversedStr: " + reversedStr);
    }
}
