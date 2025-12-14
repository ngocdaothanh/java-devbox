public class Types {
    public static void main(String[] args) {
        // Integer types
        byte b = 100;         // 1 byte
        short s = 10000;      // 2 bytes
        int i = 100000;       // 4 bytes
        long l = 100000L;     // 8 bytes

        // Floating-point types
        float f = 10.5f;      // 4 bytes
        double d = 20.99;     // 8 bytes

        // Character type
        char c = 'A';         // 2 bytes

        // Boolean type
        boolean bool = true;   // true or false

        // Print values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // With a primitive variable, we cannot write:
        // `primitiveType.someMethod()`
        //
        // because there are no methods associated with primitive types.
        // System.out.println("double: " + d.someMethod());

        // With an object type like String, we can call:
        // `objectType.someMethod()`
        String str = "Hello";
        System.out.println("String: " + str.toUpperCase());
    }
}