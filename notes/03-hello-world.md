# 03 — Hello World Program in Java

## Basic Structure

```java
// A java program to print HelloWorld
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}
```

| Line | Explanation |
|------|-------------|
| `// comment` | Single line comment |
| `public class HelloWorld` | Define a class |
| `{` | Open bracket for class |
| `public static void main(String[] args)` | main method — entry point of any Java program |
| `{` | Open bracket for main |
| `System.out.println("HelloWorld");` | Output statement — prints "HelloWorld" to console |
| `}` | Close bracket for main |
| `}` | Close bracket for class |

## How the Code Runs

```
1. Code written in "HelloWorld.java"
        ↓
2. Java compiler "javac" compiles it into bytecode file "HelloWorld.class"
        ↓
3. JVM (Java Virtual Machine) reads .class file and interprets the bytecode
        ↓
4. JVM converts bytecode to machine readable code i.e. "binary" (0/1...) and executes the program
```

## 1. Class Definition

- Every Java program must have at least one class
- If class is `public`, the filename **must** match the class name → `"HelloWorld.java"`
- If not: You will get a compile-time error

```java
public class HelloWorld {
    // statements
}
// File name must be: "HelloWorld.java"
```

**What if class is NOT public?**
- Can give any name to the file → "Yes!"
- Non-public classes are not visible outside the package
- So Java does NOT enforce strict naming here
- But: while running, you must use the **class name** instead of filename
  - `java Test.java` ✗
  - `java HelloWorld` ✓

## 2. Main Method

Every Java program must contain a main method — it is the entry point of the application.

```java
public static void main(String[] args)
```

| Keyword | Meaning |
|---------|---------|
| `public` | Allows JVM to access the method from anywhere |
| `static` | Method can run without creating an object |
| `void` | Does not return any value |
| `String[] args` | Accepts command-line arguments |

**Why static?**
- In Java, a class cannot execute without an object
- Since main method should be inside a class, main method cannot be executed without an object of its class
- `static` allows the method to run without creating an object

**Why String[] args?**
- `String[]` → array of strings
- `args` → just a variable name (can be changed)
- It is a string array to store command-line inputs
- All values are stored as Strings: `args[0]`, `args[1]`, etc.
- To use as int: `int num = Integer.parseInt(args[0]);`

**What if no `String[] args`?**
```java
public static void main() { }
```
- It will compile → but won't run
- JVM looks for exact signature: `public static void main(String[] args)`
- If not found: JVM doesn't know where to start → program won't run
- Error: "main method not found in class Hello"

## 3. System.out.println()

- Prints output to the console
- `System` → Built-in class from `java.lang` package
- `out` → Static variable (object) inside "System" class → type: `PrintStream`
  - `"public static final PrintStream out;"` 
  - Why static? "out" belongs to class, not object → so we can use it directly
- `println()` → Method that prints to console and moves to the next line

## Command-Line Arguments

```
java Hello 10 20 Kishor
```
Stored as:
```
args[0] = "10"
args[1] = "20"
args[2] = "Kishor"
```
- All values are stored as Strings
- Convert if needed: `int num = Integer.parseInt(args[0]);`
- If you give no input and access `args[0]` → error
