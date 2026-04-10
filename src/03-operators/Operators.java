// Topic: Java Operators (All Types)
// Notes reference: 06-operators.md

public class Operators {

    public static void main(String[] args) {

        // ===========================
        // 1. ARITHMETIC OPERATORS
        // ===========================
        System.out.println("=== Arithmetic Operators ===");
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));   // 13
        System.out.println("a - b = " + (a - b));   // 7
        System.out.println("a * b = " + (a * b));   // 30
        System.out.println("a / b = " + (a / b));   // 3 (integer division)
        System.out.println("a % b = " + (a % b));   // 1 (remainder)

        // ===========================
        // 2. RELATIONAL OPERATORS
        // ===========================
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > b:  " + (a > b));   // true
        System.out.println("a < b:  " + (a < b));   // false
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a >= b: " + (a >= b));  // true
        System.out.println("a <= b: " + (a <= b));  // false

        // ===========================
        // 3. LOGICAL OPERATORS
        // ===========================
        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // false (AND)
        System.out.println("x || y: " + (x || y)); // true  (OR)
        System.out.println("!x:     " + (!x));      // false (NOT)

        // ===========================
        // 4. ASSIGNMENT OPERATORS
        // ===========================
        System.out.println("\n=== Assignment Operators ===");
        int n = 10;
        n += 5;  System.out.println("n += 5: " + n);  // 15
        n -= 3;  System.out.println("n -= 3: " + n);  // 12
        n *= 2;  System.out.println("n *= 2: " + n);  // 24
        n /= 4;  System.out.println("n /= 4: " + n);  // 6
        n %= 4;  System.out.println("n %= 4: " + n);  // 2

        // ===========================
        // 5. UNARY / INCREMENT / DECREMENT
        // ===========================
        System.out.println("\n=== Unary Operators ===");
        int x1 = 10;

        // Pre-increment: increment first, then use
        System.out.println("x1=10, ++x1: " + (++x1)); // 11, x1 is now 11

        // Post-increment: use first, then increment
        System.out.println("x1=11, x1++: " + (x1++)); // 11, x1 becomes 12
        System.out.println("x1 now: " + x1);           // 12

        // Pre-decrement
        System.out.println("--x1: " + (--x1)); // 11

        // Post-decrement
        System.out.println("x1--: " + (x1--)); // 11, x1 becomes 10
        System.out.println("x1 now: " + x1);   // 10

        // ===========================
        // 6. TERNARY OPERATOR
        // ===========================
        System.out.println("\n=== Ternary Operator ===");
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + " → " + status);

        int p = 5, q = 10;
        int max = (p > q) ? p : q;
        System.out.println("Max of " + p + " and " + q + ": " + max);

        // ===========================
        // 7. INSTANCEOF OPERATOR
        // ===========================
        System.out.println("\n=== instanceof Operator ===");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String)); // true
        System.out.println("str instanceof Object: " + (str instanceof Object)); // true (every class extends Object)

        // ===========================
        // 8. BITWISE OPERATORS
        // ===========================
        System.out.println("\n=== Bitwise Operators ===");
        int m = 5;  // binary: 0101
        int k = 7;  // binary: 0111

        // AND (&): 1 only if both bits are 1
        System.out.println("5 & 7 = " + (m & k));   // 0101 & 0111 = 0101 = 5

        // OR (|): 1 if any bit is 1
        System.out.println("5 | 7 = " + (m | k));   // 0101 | 0111 = 0111 = 7

        // XOR (^): 1 if bits are different
        System.out.println("5 ^ 7 = " + (m ^ k));   // 0101 ^ 0111 = 0010 = 2

        // Bitwise NOT (~): flips all bits. ~N = -(N+1)
        System.out.println("~5 = " + (~m));          // ~5 = -(5+1) = -6

        // ===========================
        // 9. BIT-SHIFT OPERATORS
        // ===========================
        System.out.println("\n=== Bit-Shift Operators ===");

        // Left shift (<<): shifts bits left, equivalent to multiplying by 2^n
        System.out.println("5 << 1 = " + (5 << 1));  // 10  (5 * 2^1)
        System.out.println("5 << 2 = " + (5 << 2));  // 20  (5 * 2^2)

        // Signed right shift (>>): shifts bits right, preserves sign bit
        System.out.println("16 >> 2  = " + (16 >> 2));   //  4 (16 / 2^2)
        System.out.println("-16 >> 2 = " + (-16 >> 2));  // -4 (sign preserved)

        // Unsigned right shift (>>>): shifts bits right, fills 0 from left (regardless of sign)
        System.out.println("16 >>> 2  = " + (16 >>> 2));   //  4
        System.out.println("-16 >>> 2 = " + (-16 >>> 2)); // large positive number (sign bit gone)
    }
}
