// Topic: Types of Variables in Java
// Notes reference: 05-variables.md
// Three types: Local, Instance, Static

public class Variables {

    // ===========================
    // STATIC VARIABLE
    // ===========================
    // - Declared with 'static' keyword inside class, outside methods
    // - Shared by ALL objects of the class — only ONE copy exists
    // - Created at program start, destroyed when program ends
    // - Not mandatory to initialize (gets default value)
    // - Access via class name: Variables.schoolName
    static String schoolName = "Java Academy";
    static int studentCount = 0;

    // ===========================
    // INSTANCE VARIABLE
    // ===========================
    // - Declared inside class, outside any method/constructor/block
    // - Each OBJECT gets its own copy
    // - Created when object is instantiated, destroyed when object is destroyed
    // - Not mandatory to initialize (gets default: 0 for int, null for String, etc.)
    // - Scope is throughout the class (except static context)
    String name;      // default: null
    int age;          // default: 0
    double gpa;       // default: 0.0

    // Constructor — initializes instance variables
    public Variables(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        studentCount++;  // accessing static variable
    }

    public void displayInfo() {

        // ===========================
        // LOCAL VARIABLE
        // ===========================
        // - Declared inside a method, block, or constructor
        // - Created at time of declaration, destroyed after block ends
        // - MUST be initialized before use (no default value)
        // - Scope is only within the block it is created
        String greeting = "Hello"; // local variable — must initialize
        int tempScore = 95;        // local variable

        System.out.println(greeting + ", " + name);
        System.out.println("Age: " + age + " | GPA: " + gpa);
        System.out.println("Temp score: " + tempScore);
        System.out.println("School: " + schoolName);      // static var accessible
        System.out.println("Total students: " + studentCount); // static var
    }

    public static void main(String[] args) {

        System.out.println("=== Variables Demo ===\n");

        // Accessing static variable before creating any object
        System.out.println("School: " + Variables.schoolName);
        System.out.println("Students so far: " + Variables.studentCount);

        // Creating objects — each gets its own instance variables
        Variables student1 = new Variables("Alice", 20, 3.8);
        Variables student2 = new Variables("Bob", 22, 3.5);

        student1.displayInfo();
        System.out.println("---");
        student2.displayInfo();

        // Static variable is shared — changes reflect for ALL
        System.out.println("\nTotal students: " + Variables.studentCount); // 2

        // Demonstrating scope of local variable
        {
            int blockVar = 100; // local to this block
            System.out.println("Inside block: " + blockVar);
        }
        // System.out.println(blockVar); // ERROR! blockVar not accessible here

        // Local var must be initialized before use
        int x;
        // System.out.println(x); // ERROR! x might not have been initialized
        x = 10;
        System.out.println("x = " + x); // OK now
    }
}
