# 13 — Access Modifiers in Java

## What are Access Modifiers?

- Access modifiers define **how variables, methods, classes can be accessed from other parts of our program**

```
Access Modifier
├── Private
├── Default
├── Protected
└── Public
```

---

## 1. Private Access Modifier

→ Accessible **only within the class** in which they are declared

```java
class Person {
    private String name;

    public void setName(String name) {
        this.name = name;  // accessible within class
    }

    public String getName() {
        return name;
    }
}

public class Geeks {
    psvm() {
        Person p = new Person();
        p.setName("Alice");
        sout(p.name);      // Error: 'name' has private access
        sout(p.getName()); // but can be accessed by methods, getters or setters if method is not private
    }
}
```

→ Direct access to `name` is not allowed outside `Person` class, enforcing **encapsulation**  
→ But can be accessed using **non-private getters or setters**

---

## 2. Default Access Modifier

→ If no access specifier is specified, the member is **default (package-private)** access and can only be accessed within the **same package**  
→ Which means only classes within **same package** can access it

```java
// file = 1
package p1;
class Greek {  // class greek is default
    void display() {
        sout("Hello world");
    }
}
// Geeks.java

// file = 2
package p2;
import p1.*;  // importing package p1 — without importing we can't access other package members
class GreekNew {  // default GreekNew class
    psvm() {
        Greek o = new Greek();  // Accessing from p1 using object of class Greek
        o.display();
    }
}
// GreeksNew.java
```

---

## 3. Protected Access Modifier

- Can be accessible only **within the same package**
- **Cannot access** in another package even after importing also
- But **can be accessed in another package if** that another package contains **sub-class of the class** present in main package

```java
// file: Vehicle.java
package p1;
public class Vehicle {
    protected int speed;
}

// file: Bike.java
package p2;
import p1.Vehicle;
public class Bike extends Vehicle {
    void showSpeed() {
        speed = 100;  // allowed: subclass in different package
        sout(speed);
    }
}
// 3

// Public class Car
// {
//     speed = 100;  // error: cannot access in non-subclass
// }

// file: Test.java
package p2;
import p1.Vehicle;
public class Test {
    psvm() {
        Bike b = new Bike();
        b.showSpeed();  // 100

        Vehicle v = new Vehicle();
        sout(v.speed);  // Error: can't access protected outside package & non-subclass
    }
}
```

---

## 4. Public Access Modifier

- **Accessible from everywhere** in program
- **No restriction** on scope of public data members

```java
class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    psvm() {
        sout(MathUtils.add(5, 10));  // accessible anywhere
        sout(add(5, 10));  // error — should use class name
    }
}
```

> **Note:** Top-level classes or interfaces **can not be declared as private** because private means "Only visible within the enclosing class."

---

## Summary Table

| Modifier | Same Class | Same Package | Subclass (diff pkg) | Everywhere |
|----------|-----------|--------------|---------------------|------------|
| `private` | ✅ | ❌ | ❌ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `public` | ✅ | ✅ | ✅ | ✅ |
