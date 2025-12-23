public class Box {
    public static void main(String[] args) {
        System.out.println(Integer.toHexString(123));

        // i will be automatically "boxed".
        // j will be automatically "unboxed".
        int i = 123;
        int j = boxExample(i);
        System.out.println("j: " + j);
    }

    private static Integer boxExample(Integer i) {
        System.out.println("i: " + i);
        return i + 1;
    }
}
