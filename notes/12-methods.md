# 12 — Java Methods

## What is a Method?

- Java Methods are **blocks of code that perform a specific task**
- A method allows to write a piece of logic **once and reuse** it wherever needed
- Helps to keep code **clean, organized, easier to understand and manage**
- **All methods in Java must belong to a class**

## Why Use Methods?

- Code Reusability
- Modularity
- Readability
- Maintainability

## Method Structure

```
         return type   Method-name       Parameter list
              ↓             ↓                  ↓
public      int         max          (int x, int y)
  ↑
Modifier
{
    if (x > y)
        return x;   ←───── Body of Method
    else
        return y;
}
```

---

## Types of Methods

### 1. Predefined Method
- Already defined in Java libraries
- Example: `random()` method which is present in `"Math"` class
- Call it using `"ClassName.methodName()"`

```java
Math.random()   // returns random value
Math.PI         // returns value of π as a constant (it's a constant, not a method)
```

### 2. User-defined Method
- Written by user. Modified according to requirement.

```java
int Hello() {
    sout("Hi");
}
```

---

## Different Ways to Create Java Method

There are **2 ways** to create a method in Java:

### 1. Instance Method
- Belongs to an **object** of a class
- To run this method, it **requires object** of class
- You **can't run it or call it** without help of object of class
- It can **access and modify** the object's instance variables
- It can also call other instance or static methods

```java
class Person {
    String name = "Alice";

    // Instance method
    void greet() {
        sout("Hello" + name + "!");
    }

    psvm() {
        // greet(); // error — you can't call without object
        Person p = new Person();  // create object
        p.greet();  // call with help of object
    }
}
```

**2 types of instance methods:**
- **Getters** → Used to retrieve value of private instance variable
- **Setters** → Used to modify value of private instance variable

```java
class Account {
    private int balance = 100;

    public int getBalance() {   // getter func
        return balance;
    }

    public void setBalance(int amt) {   // setter func
        balance += amt;
    }
}
```

### 2. Static Method
- `static` keyword is used to create a method that **belongs to class, not specific to any object** like Instance Method
- It **can be accessed without any object** help
- Can be accessed by all instances of class, but does not rely on any specific instance
- **Static method can access static variable directly** without the need for an object
- They **cannot access non-static variables** (instance) or methods directly
- Static methods can be accessed directly in **both static and non-static contexts**
- `"this"` and `"super"` are **not allowed** to be used in static environment

```java
public class Geeks {
    static int a = 40;
    int b = 50;

    void display() {
        sout(a);  // static variable can be accessed in non-static method
        sout(b);
    }

    static void staticDisplay() {
        sout(a);
        // sout(b);    // throws error: non-static variable b can't be accessed in static method
        // this.a;     // error
    }

    psvm() {
        sout(staticDisplay() 0);  // static method can be accessed without object

        Geeks obj = new Geeks();
        obj.display();        // non-static needs obj to access
        obj.staticDisplay();  // we can access static method using obj also
        Print();              // throws error (if trying to access static method from another class)
        Sample.print();       // to access static method from another class use class name
    }
}

class Sample {
    static void print() {
        sout("Hello");
    }
}
// Syntax: ClassName.methodName()
```

---

## Method Call Stack in Java

- Java is an object-oriented and **stack-based** programming language
- When method is called, Java uses internal structure known as **Call Stack** to manage execution, variables, and return addresses

### What is Call Stack?
- Call stack is **data structure used by program during runtime** to manage calls & local variables
- It operates in **LIFO (Last In First Out)**

### How Methods Are Executed?

When a method is called:
1. A new **stack frame is added** to call stack
2. The frame **stores the method details** in stack
3. The method **runs its code**
4. After execution, **stack frame is removed**
5. Control goes back to **function which called** this method

> JVM automatically manages the call stack
