// Topic: Java Methods
// Notes reference: 12-methods.md

public class Methods {

    // ===========================
    // STATIC VARIABLES (for demo)
    // ===========================
    static int a = 40;
    int b = 50;  // instance variable

    // ===========================
    // INSTANCE METHOD
    // ===========================
    // - Belongs to an object of the class
    // - Requires object to call
    // - Can access both static and instance variables
    void instanceDisplay() {
        System.out.println("Instance method:");
        System.out.println("  static a = " + a);    // static variable accessible
        System.out.println("  instance b = " + b);  // instance variable accessible
    }

    // ===========================
    // STATIC METHOD
    // ===========================
    // - Belongs to class, not specific to any object
    // - Can be called without creating object
    // - CANNOT access non-static (instance) variables directly
    // - 'this' and 'super' not allowed in static context
    static void staticDisplay() {
        System.out.println("Static method:");
        System.out.println("  static a = " + a);
        // System.out.println(b); // ERROR! non-static variable b in static context
    }

    // ===========================
    // METHOD WITH PARAMETERS AND RETURN
    // ===========================
    public static int max(int x, int y) {
        if (x > y) return x;
        else return y;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);  // recursive call
    }

    // ===========================
    // CALL STACK DEMO
    // ===========================
    // When main calls A(), A's frame is pushed onto stack
    // When A() calls B(), B's frame is pushed
    // When B() returns, its frame is popped

    public static void methodC() {
        System.out.println("  Inside C()");
        // C returns → stack frame removed, control goes back to B
    }

    public static void methodB() {
        System.out.println("  Inside B() — calling C()");
        methodC();  // C's frame pushed
        System.out.println("  Back in B() after C() returned");
    }

    public static void methodA() {
        System.out.println("  Inside A() — calling B()");
        methodB();  // B's frame pushed
        System.out.println("  Back in A() after B() returned");
    }

    public static void main(String[] args) {

        System.out.println("=== Static vs Instance Methods ===");

        // Static method — no object needed
        Methods.staticDisplay();  // can use class name
        staticDisplay();          // OR just method name (within same class)

        // Instance method — object required
        Methods obj = new Methods();
        obj.instanceDisplay();

        // Can call static via object (works but shows compiler warning)
        // obj.staticDisplay(); // not recommended

        // ===========================
        // PREDEFINED METHODS (from Math class)
        // ===========================
        System.out.println("\n=== Predefined Methods ===");
        System.out.println("Math.random(): " + Math.random()); // 0.0 to 1.0
        System.out.println("Math.PI: " + Math.PI);             // constant (not a method)
        System.out.println("Math.abs(-10): " + Math.abs(-10)); // 10
        System.out.println("Math.pow(2, 10): " + Math.pow(2, 10)); // 1024.0
        System.out.println("Math.sqrt(25): " + Math.sqrt(25));     // 5.0
        System.out.println("Math.max(3, 7): " + Math.max(3, 7));   // 7

        // ===========================
        // USER-DEFINED METHOD CALLS
        // ===========================
        System.out.println("\n=== User-defined Methods ===");
        System.out.println("max(10, 25) = " + max(10, 25));
        System.out.println("factorial(5) = " + factorial(5)); // 120

        // ===========================
        // CALL STACK DEMO
        // ===========================
        System.out.println("\n=== Call Stack Demo ===");
        System.out.println("main() starts — calling A()");
        methodA();
        System.out.println("Back in main() after A() returned");
        // Stack: main → A → B → C (grows), then C pops, B pops, A pops, main ends
    }
}

// ===========================
// GETTERS AND SETTERS DEMO
// ===========================
class BankAccount {

    private int balance = 100;  // private — can't access directly from outside

    // Getter — retrieves the private value
    public int getBalance() {
        return balance;
    }

    // Setter — modifies the private value in a controlled way
    public void setBalance(int amount) {
        balance += amount;  // add to existing balance
    }

    // Main for demo
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        // acc.balance = 999; // ERROR! balance has private access

        System.out.println("Balance: " + acc.getBalance()); // 100 (only read)
        acc.setBalance(50);
        System.out.println("After deposit: " + acc.getBalance()); // 150
    }
}
