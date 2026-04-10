// Topic: Jump Statements in Java
// Notes reference: 11-jump-statements.md

public class JumpStatements {

    // ===========================
    // return — exits method
    // ===========================
    public static int sum(int n, int m) {
        int result = n + m;
        return result;  // exits method and returns value
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;   // early return
        }
        return false;
    }

    public static void printPositive(int n) {
        if (n <= 0) {
            return;  // return without value (void method)
        }
        System.out.println("Positive number: " + n);
    }

    public static void main(String[] args) {

        // ===========================
        // 1. continue — skips current iteration
        // ===========================
        System.out.println("=== continue ===");
        // Skip even numbers, print only odd
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;  // skips rest of loop body, goes to next iteration
            }
            System.out.print(i + " "); // 1 3 5 7 9
        }
        System.out.println();

        // Skip number 2 specifically
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.print(i + " "); // 0 1 3 4
        }
        System.out.println();

        // ===========================
        // 2. break — exits the loop
        // ===========================
        System.out.println("\n=== break ===");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;  // exits the loop when i reaches 4
            }
            System.out.print(i + " "); // 0 1 2 3
        }
        System.out.println();

        // break in while loop
        int n = 0;
        while (true) {
            if (n >= 5) break;
            System.out.print(n + " ");
            n++;
        }
        System.out.println();

        // ===========================
        // 3. break with labels (goto alternative)
        // ===========================
        System.out.println("\n=== break with labels ===");
        // Java uses labels with break to jump out of nested loops

        outer:
        for (int i = 0; i < 3; i++) {
            inner:
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
                if (i == 1 && j == 1) {
                    break outer;  // breaks out of OUTER loop entirely
                }
            }
        }
        System.out.println("\n(stopped at i=1, j=1)");

        // continue with label
        System.out.println("\n--- continue with label ---");
        outer2:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue outer2;  // skip to next iteration of outer loop
                }
                System.out.print("(" + i + "," + j + ") ");
            }
        }
        System.out.println();

        // ===========================
        // 4. return
        // ===========================
        System.out.println("\n=== return ===");
        int result = sum(10, 15);
        System.out.println("sum(10, 15) = " + result);   // 25

        System.out.println("isEven(4): " + isEven(4));    // true
        System.out.println("isEven(7): " + isEven(7));    // false

        printPositive(10);   // prints
        printPositive(-5);   // returns without printing
    }
}
