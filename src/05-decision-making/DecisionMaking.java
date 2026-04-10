// Topic: Decision Making in Java
// Notes reference: 09-decision-making.md

public class DecisionMaking {

    public static void main(String[] args) {

        // ===========================
        // 1. if
        // ===========================
        System.out.println("=== if ===");
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // ===========================
        // 2. if-else
        // ===========================
        System.out.println("\n=== if-else ===");
        int marks = 45;
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // ===========================
        // 3. if-else-if
        // ===========================
        System.out.println("\n=== if-else-if ===");
        int score = 75;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // ===========================
        // 4. Nested if
        // ===========================
        System.out.println("\n=== Nested if ===");
        int num = 15;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is positive and even");
            } else {
                System.out.println(num + " is positive and odd");
            }
        }

        // ===========================
        // 5. Ternary Operator
        // ===========================
        System.out.println("\n=== Ternary Operator ===");
        int a = 10, b = 20;
        int larger = (a > b) ? a : b;
        System.out.println("Larger of " + a + " and " + b + ": " + larger);

        String result = (marks >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        // ===========================
        // 6. switch Statement
        // ===========================
        System.out.println("\n=== switch ===");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }

        // switch with String
        String season = "Summer";
        switch (season) {
            case "Summer":
                System.out.println("Hot and sunny");
                break;
            case "Winter":
                System.out.println("Cold and chilly");
                break;
            default:
                System.out.println("Mild weather");
        }

        // ===========================
        // 7. Enhanced Switch (Java 14+)
        // ===========================
        System.out.println("\n=== Enhanced switch (Java 14+) ===");
        int dayNum = 2;
        String dayName = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3, 4, 5 -> "Midweek";       // multiple labels in one case
            case 6, 7 -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("Day: " + dayName);

        // Note: case labels must be literals or constants — variables NOT allowed
        // int x = 1;
        // case x: // ERROR! Variable in case label not allowed
    }
}
