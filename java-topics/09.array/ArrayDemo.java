public class ArrayDemo {
    public static void main(String[] args) {
        createArrayWithSize();
        createArrayWithInitialValues();
    }

    private static void createArrayWithSize() {
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 9;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.println("Number at index " + i + ": " + num);
        }
    }

    private static void createArrayWithInitialValues() {
        int[] numbers = {1, 5, 9};

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.println("Number at index " + i + ": " + num);
        }
    }
}
