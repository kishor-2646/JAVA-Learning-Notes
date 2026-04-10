# 05 — Types of Variables in Java

## Overview

```
Type of Variable
├── Local Variable
├── Instance Variable
└── Static Variable
```

---

## 1. Local Variable

- A variable defined **within a block, method, or constructor**
- Created at time of declaration, destroyed when function completes its execution
- Scope is **only within the block** in which it was created
- **Need to initialize before using** it within scope → `a = 10;`

```java
class Student {
    void display() {
        int marks = 90;  // local variable — must initialize
        System.out.println(marks);
    }
}
```

---

## 2. Instance Variable

- Known as **non-static variables**
- Declared **in a class outside of any method, constructor, or block**
- Created when object is instantiated, destroyed when object is destroyed
- Can have access specifiers; **default access** is used if none is specified
- **Not mandatory to initialize** — takes default values based on data type
  - `0` for int, `null` for String, etc.
- Scope is **throughout the class**, except in static context
- Accessed **only through objects** of the class
- Can be initialized using **Constructors or instance blocks**

```java
class Student {
    public int i;  // Declaring without initialisation

    public Student() {
        // Initialising Instance Variable using constructor
        this.i = 10;
    }
}
```

---

## 3. Static Variable

- Variables declared with **"static"** keyword inside a class but **outside any method**
- **Shared among all objects** of class and exist for entire lifetime of program
- There is only **one copy** of static variable for entire class — all objects share it
- Created at **program start**, destroyed when program ends
- **Not mandatory to initialize** — default assigned based on data type
- Can be accessed via **class name** (accessing through objects shows compiler warning)
- **Cannot** be defined or declared inside instance method locally

```java
class Geeks {
    // Static variable
    static String geek = "Hi welcome!";

    public static void main(String[] args) {
        // Access static without creating object
        sout(Geeks.geek);

        // static int c = 0;  // Error: static variables cannot be declared inside a method
    }
}
```

---

## Comparison Table

| Feature | Local | Instance | Static |
|---------|-------|----------|--------|
| Where declared | Inside method/block | Inside class, outside method | Inside class with `static` keyword |
| Created when | Declaration reached | Object instantiated | Program starts |
| Destroyed when | Block ends | Object destroyed | Program ends |
| Default value | None (must initialize) | Yes (0, null, etc.) | Yes (0, null, etc.) |
| Access | Within block only | Through object | Via class name |
| Copies | Per call | Per object | One for entire class |
