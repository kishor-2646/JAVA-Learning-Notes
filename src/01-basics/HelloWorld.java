// Topic: Hello World Program in Java
// Notes reference: 03-hello-world.md

public class HelloWorld {

    // main method - entry point of every Java program
    // public  → JVM can access from anywhere
    // static  → can run without creating an object
    // void    → does not return any value
    // String[] args → accepts command-line arguments
    public static void main(String[] args) {

        // System  → built-in class from java.lang package
        // out     → static variable (object) inside System class (PrintStream type)
        // println → method that prints to console and moves to next line
        System.out.println("Hello World!");

        // Other print methods
        System.out.print("Hello ");       // no newline at end
        System.out.println("Java!");      // with newline
        System.out.printf("Value: %d%n", 42); // formatted print

        // --- Command-line arguments demo ---
        // Run: java HelloWorld 10 20 Kishor
        // args[0] = "10", args[1] = "20", args[2] = "Kishor"
        System.out.println("\n--- Command-line Arguments ---");
        System.out.println("Number of args: " + args.length);

        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("Arg: " + arg);
            }
            // Converting string arg to int
            // int num = Integer.parseInt(args[0]);
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}

/*
 * How to run:
 *   javac HelloWorld.java
 *   java HelloWorld
 *   java HelloWorld 10 20 Kishor   (with args)
 *
 * What happens:
 *   1. HelloWorld.java → javac → HelloWorld.class (bytecode)
 *   2. HelloWorld.class → JVM reads bytecode
 *   3. JVM converts to machine code (0s and 1s) and executes
 */
