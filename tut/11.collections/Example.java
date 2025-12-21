import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        listDemo();

        System.out.println("-----");
        setMap();

        System.out.println("-----");
        setDemo();

        System.out.println("-----");
        badSetDemo();
    }

    private static void listDemo() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");

        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void setMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Alice", 35); // Update value for existing key "Alice"

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void setDemo() {
        Set<String> set = new HashSet<>();
        set.add("Alice");
        set.add("Bob");
        set.add("Alice"); // Duplicate, will not be added

        for (String name : set) {
            System.out.println(name);
        }
    }

    // Do not use a Map where the values are booleans as a Set
    private static void badSetDemo() {
        Map<String, Boolean> set = new HashMap<>();
        set.put("Alice", true);
        set.put("Bob", true);

        for (String name : set.keySet()) {
            System.out.println(name);
        }
    }
}
