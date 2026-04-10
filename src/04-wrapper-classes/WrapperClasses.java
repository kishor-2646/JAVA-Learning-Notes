// Topic: Wrapper Classes in Java
// Notes reference: 08-wrapper-classes.md

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        // ===========================
        // PRIMITIVE → WRAPPER MAPPING
        // ===========================
        // byte → Byte     | short → Short    | int → Integer  | long → Long
        // float → Float   | double → Double  | char → Character | boolean → Boolean

        System.out.println("=== Wrapper Class Basics ===");
        int i = 10;
        Integer intObj = Integer.valueOf(i);   // primitive → wrapper (manual)
        System.out.println("int: " + i + " → Integer: " + intObj);

        float f = 13.6f;
        Float floatObj = Float.valueOf(f);
        System.out.println("float: " + f + " → Float: " + floatObj);

        char c = 'a';
        Character charObj = c;   // autoboxing
        System.out.println("char: " + c + " → Character: " + charObj);

        // ===========================
        // AUTOBOXING (primitive → object, automatic)
        // ===========================
        System.out.println("\n=== Autoboxing ===");
        int num = 25;
        Integer numObj = num;  // autoboxing: int → Integer
        System.out.println("Autoboxed: " + numObj);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);  // autoboxing: int → Integer (Collections require objects)
        System.out.println("ArrayList add with autoboxing: " + list.get(0));

        // ===========================
        // UNBOXING (object → primitive, automatic)
        // ===========================
        System.out.println("\n=== Unboxing ===");
        Integer boxed = 100;
        int unboxed = boxed;  // unboxing: Integer → int
        System.out.println("Unboxed: " + unboxed);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(84);
        int n = list2.get(0);  // unboxing: Integer → int
        System.out.println("Unboxed from list: " + n);

        // ===========================
        // WRAPPER CLASS METHODS
        // ===========================
        System.out.println("\n=== Wrapper Methods ===");

        // 1. parseInt / parseXxx — String → primitive
        int parsed = Integer.parseInt("100");
        System.out.println("parseInt(\"100\"): " + parsed);  // 100 (primitive)

        // 2. valueOf(String) — String → wrapper object
        Integer valueOfStr = Integer.valueOf("100");
        System.out.println("valueOf(\"100\"): " + valueOfStr + " (object)");

        // 3. valueOf(primitive) — primitive → wrapper object
        Integer valueOfPrim = Integer.valueOf(10);
        System.out.println("valueOf(10): " + valueOfPrim);

        // 4. xxxValue() — wrapper → primitive
        Integer obj = 50;
        int intVal = obj.intValue();
        System.out.println("intValue(): " + intVal);

        // 5. toString() — wrapper → String
        String s = Integer.toString(10);
        System.out.println("toString(10): " + s);  // "10"

        // 6. compareTo() — compares two wrapper objects
        Integer a = 10, b = 20;
        System.out.println("10.compareTo(20): " + a.compareTo(b)); // -1 (a < b)
        System.out.println("20.compareTo(10): " + b.compareTo(a)); // 1  (b > a)
        System.out.println("10.compareTo(10): " + a.compareTo(a)); // 0  (equal)

        // 7. equals() — compares values (not references)
        Integer x = 100, y = 100;
        System.out.println("\n100.equals(100): " + x.equals(y));  // true

        // 8. hashCode()
        Integer h = 100;
        System.out.println("hashCode of 100: " + h.hashCode()); // 100 (for Integer, hashCode = value)

        // 9. min, max, sum
        System.out.println("\nmin(10, 20): " + Integer.min(10, 20));  // 10
        System.out.println("max(10, 20): " + Integer.max(10, 20));  // 20
        System.out.println("sum(10, 20): " + Integer.sum(10, 20));  // 30

        // 10. decode — decimal, hex, octal string → Integer
        System.out.println("\ndecode(\"0XA\"): " + Integer.decode("0XA"));  // 10 (hex)
        System.out.println("decode(\"010\"): " + Integer.decode("010"));   // 8  (octal)
        System.out.println("decode(\"10\"):  " + Integer.decode("10"));    // 10 (decimal)

        // 11. parseBoolean
        System.out.println("\nparseBoolean(\"true\"):  " + Boolean.parseBoolean("true"));  // true
        System.out.println("parseBoolean(\"false\"): " + Boolean.parseBoolean("false")); // false
        System.out.println("parseBoolean(\"Hello\"): " + Boolean.parseBoolean("Hello")); // false (anything != "true" is false)

        // 12. isNaN, isInfinite
        double val1 = 0.0 / 0.0;
        double val2 = 10.0 / 0.0;
        System.out.println("\nisNaN(0.0/0.0):    " + Double.isNaN(val1));      // true
        System.out.println("isInfinite(10/0.0): " + Double.isInfinite(val2)); // true

        // ===========================
        // INTEGER CACHE (-128 to 127)
        // ===========================
        System.out.println("\n=== Integer Cache Behaviour ===");
        Integer p = 100, q = 100;
        Integer r = 200, t = 200;
        System.out.println("100 == 100: " + (p == q)); // TRUE  (cached, same object)
        System.out.println("200 == 200: " + (r == t)); // FALSE (outside cache, new objects)
        System.out.println("200.equals(200): " + r.equals(t)); // TRUE (compares values)

        // RULE: Use == for primitives, .equals() for objects
    }
}
