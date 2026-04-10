// Topic: Loops in Java
// Notes reference: 10-loops.md

public class Loops {

    public static void main(String[] args) {

        // ===========================
        // 1. for loop
        // ===========================
        System.out.println("=== for loop ===");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Countdown using decrement
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Nested for loop — multiplication table
        System.out.println("\n--- Multiplication table (1-3) ---");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // ===========================
        // 2. for-each loop (enhanced for)
        // ===========================
        System.out.println("=== for-each loop ===");
        int[] nums = {1, 2, 3, 4};
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // ===========================
        // 3. while loop
        // ===========================
        System.out.println("\n=== while loop ===");
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // while with user-defined condition
        int sum = 0;
        int num = 1;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("Sum of 1 to 100: " + sum); // 5050

        // ===========================
        // 4. do-while loop
        // ===========================
        System.out.println("\n=== do-while loop ===");
        // Executes AT LEAST ONCE, then checks condition
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 10);
        System.out.println();

        // Even when condition is false from the start, runs once
        int k = 100;
        do {
            System.out.println("This prints once even though k=100 > 5");
        } while (k < 5);

        // ===========================
        // 5. Infinite loop variants
        // ===========================
        // for(;;)  { }   → valid infinite loop
        // for(;true;) {}  → valid infinite loop
        // while(true) {}  → valid infinite loop

        // ===========================
        // 6. Star pattern (practice)
        // ===========================
        System.out.println("\n=== Star Pattern ===");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
