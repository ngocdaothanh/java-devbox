import java.util.ArrayList;
import java.util.List;

public class Lambda {
    // Concrete class
    static class MyRunner implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from MyRunner!");
        }
    }

    public static void main(String[] args) {
        example1();
        example2();
    }

    private static void example1() {
        Runnable mr = new MyRunner();
        mr.run();

        // Anonymous class
        Runnable ar = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Anonymous Runnable!");
            }
        };
        ar.run();

        // Lambda (arrow function in JS)
        Runnable r = () -> System.out.println("Hello, Lambda!");
        r.run();
    }

    private static void example2() {
        List<Integer> nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // nums.filter(n -> n > 2).forEach(System.out::println);
        nums
            .stream()
            .filter(n -> {
                System.out.println(n);
                return n > 2;
            });
            // Consume the stream
            // .forEach(System.out::println);
    }
}
