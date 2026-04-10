// Topic: Access Modifiers in Java
// Notes reference: 13-access-modifiers.md

// ===========================
// PRIVATE Access Modifier
// ===========================
// Accessible ONLY within the class it is declared in.
// Enforces encapsulation.
class Person {
    private String name;       // private — not accessible outside Person class
    private int age;

    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter — provides READ access to private variable
    public String getName() {
        return name;
    }

    // Setter — provides WRITE access to private variable
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        // Inside the same class — private is accessible
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// ===========================
// DEFAULT (package-private)
// ===========================
// No keyword used. Accessible within the SAME PACKAGE only.
// Even after importing, another package cannot access it.
class DefaultExample {
    int value = 42;  // default access — no modifier keyword

    void display() {
        System.out.println("Default access value: " + value);
    }
}

// ===========================
// PROTECTED Access Modifier
// ===========================
// Accessible within same package AND in subclasses of different packages
class Vehicle {
    protected int speed;

    protected void showSpeed() {
        System.out.println("Speed: " + speed);
    }
}

// Subclass in same package — can access protected
class Bike extends Vehicle {
    void accelerate() {
        speed = 100;  // allowed: subclass in different package still allowed
        showSpeed();
    }
}

// ===========================
// PUBLIC Access Modifier
// ===========================
// Accessible from EVERYWHERE in the program — no restrictions
class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// ===========================
// MAIN DEMO CLASS
// ===========================
public class AccessModifiers {

    public static void main(String[] args) {

        System.out.println("=== Private Access ===");
        Person p = new Person("Alice", 25);

        // p.name = "Bob";  // ERROR! name has private access
        p.setName("Bob");   // OK — public setter
        System.out.println("Name via getter: " + p.getName());  // Bob
        System.out.println("Age via getter:  " + p.getAge());   // 25
        p.displayInfo();    // OK — displayInfo() is public

        System.out.println("\n=== Default Access ===");
        DefaultExample def = new DefaultExample();
        System.out.println("Default value: " + def.value);  // accessible — same package
        def.display();

        System.out.println("\n=== Protected Access ===");
        Bike bike = new Bike();
        bike.accelerate();
        // bike.speed = 200;  // accessible (same package), but not recommended directly

        System.out.println("\n=== Public Access ===");
        // Accessible from anywhere, no object needed for static
        System.out.println("add(5, 10) = " + MathUtils.add(5, 10));
        System.out.println("circleArea(5) = " + MathUtils.circleArea(5));

        // ===========================
        // SUMMARY TABLE (printed)
        // ===========================
        System.out.println("\n=== Access Modifier Summary ===");
        System.out.println("Modifier    | Same Class | Same Package | Subclass | Everywhere");
        System.out.println("------------|------------|--------------|----------|----------");
        System.out.println("private     |    YES     |      NO      |    NO    |    NO");
        System.out.println("default     |    YES     |      YES     |    NO*   |    NO");
        System.out.println("protected   |    YES     |      YES     |    YES   |    NO");
        System.out.println("public      |    YES     |      YES     |    YES   |    YES");
        System.out.println("*default accessible in subclass only if in same package");
    }
}
