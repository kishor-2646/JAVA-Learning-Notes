// Topic: Java Data Types
// Notes reference: 04-data-types.md

public class DataTypes {

    public static void main(String[] args) {

        // ========================
        // PRIMITIVE DATA TYPES
        // ========================

        // boolean — logical, true or false
        boolean isJavaFun = true;
        boolean isHard = false;
        System.out.println("boolean: " + isJavaFun);

        // byte — 8-bit, range: -128 to 127
        byte age = 25;
        byte minByte = -128;
        byte maxByte = 127;
        System.out.println("byte: " + age + " | range: " + minByte + " to " + maxByte);

        // short — 16-bit, range: -32768 to 32767
        short temperature = -200;
        System.out.println("short: " + temperature);

        // int — 32-bit, most commonly used integer type
        int population = 1400000000;
        System.out.println("int: " + population);

        // long — 64-bit, use 'L' suffix
        long distanceToSun = 149600000L;
        System.out.println("long: " + distanceToSun);

        // float — 32-bit floating-point, use 'f' suffix (MANDATORY)
        float pi = 3.14f;
        float price = 19.99f;
        System.out.println("float: " + pi);

        // double — 64-bit floating-point, default for decimal numbers
        double precisePi = 3.141592653589793;
        System.out.println("double: " + precisePi);

        // char — 16-bit Unicode character, use single quotes
        char grade = 'A';
        char unicodeChar = '\u0041'; // 'A' in Unicode
        System.out.println("char: " + grade + " | Unicode: " + unicodeChar);

        // ========================
        // IMPORTANT NOTES
        // ========================

        // Any decimal literal is DOUBLE by default
        double d1 = 0.5;    // OK — double
        double d2 = 0.5d;   // OK — explicit double
        float  f1 = 0.01f;  // OK — explicit float with 'f'
        // float f2 = 0.01; // ERROR! 0.01 is a double, can't assign to float without cast

        // Explicit cast (narrowing conversion)
        float f2 = (float) 0.01;
        System.out.println("Explicit cast double to float: " + f2);

        // ========================
        // TYPE SIZES
        // ========================
        System.out.println("\n--- Type Sizes ---");
        System.out.println("int size:    " + Integer.SIZE   + " bits = " + Integer.BYTES   + " bytes");
        System.out.println("long size:   " + Long.SIZE      + " bits = " + Long.BYTES      + " bytes");
        System.out.println("float size:  " + Float.SIZE     + " bits = " + Float.BYTES     + " bytes");
        System.out.println("double size: " + Double.SIZE    + " bits = " + Double.BYTES    + " bytes");

        // ========================
        // NON-PRIMITIVE (reference)
        // ========================
        String name = "Java";              // String (not primitive)
        int[] numbers = {1, 2, 3, 4, 5};  // Array (not primitive)
        System.out.println("\nString: " + name);
        System.out.println("Array[0]: " + numbers[0]);
    }
}
