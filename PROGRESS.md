# 📊 Learning Progress Tracker

Track your Java journey here. Check off each item as you complete it.

---

## ✅ Topics Completed

### 1. Introduction to Java
- [x] What is Java? (High-level, OOP language)
- [x] History — developed by Sun Microsystems (1995), invented by James Gosling (1991)
- [x] Originally named "OAK", renamed to Java (1995)
- [x] Features: OOP, Robust, Platform-independent, Multithreading, Rich APIs
- [x] Java owned by Oracle now
- [x] WORA — Write Once, Run Anywhere

### 2. JVM / JDK / JRE Architecture
- [x] How Java code runs: .java → javac → .class (bytecode) → JVM → machine code
- [x] JDK = JRE + Development Tools (javac, jar, javadoc, debugger)
- [x] JRE = JVM + Libraries (for end users, no dev tools)
- [x] JVM = execution engine (loads bytecode, verifies, executes)
- [x] JVM components: Class Loader, Memory Areas, Execution Engine, JNI
- [x] Memory Areas: Method Area, Heap, Stack, PC Registers, Native Method Stack
- [x] Execution Engine: Interpreter, JIT Compiler, Garbage Collector
- [x] Platform independence — each OS has its own JVM

### 3. Hello World Program
- [x] Basic structure of a Java program
- [x] Class definition rules (public class = filename must match)
- [x] main method: `public static void main(String[] args)`
  - [x] public → JVM can access from anywhere
  - [x] static → runs without creating object
  - [x] void → no return value
  - [x] String[] args → command-line arguments
- [x] System.out.println() explained (System class, out static var, println method)
- [x] Command-line arguments (args[0], args[1], Integer.parseInt)

### 4. Java Data Types
- [x] Primitive vs Non-primitive
- [x] Non-numeric: boolean, char
- [x] Numeric integers: byte, short, int, long
- [x] Numeric floating-point: float, double
- [x] Size, range, and default values table
- [x] Decimal numbers default to double in Java
- [x] Must use `f` suffix for float literals (e.g., 3.14f)

### 5. Variables
- [x] Three types: Local, Instance, Static
- [x] Local: inside method/block, must initialize before use, destroyed after block
- [x] Instance: per object, created when object instantiated, takes default values
- [x] Static: shared by all objects, class-level, created at program start
- [x] Static variables cannot be declared inside methods

### 6. Operators
- [x] Arithmetic: +, -, *, %, /
- [x] Logical: &&, ||, !
- [x] Unary: ++, --
- [x] Ternary: condition ? true : false
- [x] Assignment: +=, -=, =, /=, %=, *=
- [x] Relational: >, <, ==, <=, >=, !=
- [x] instanceof operator
- [x] Bitwise operators: &, |, ^, ~, <<, >>, >>>
- [x] Pre/Post increment/decrement behavior
- [x] Bit-shift operators with examples

### 7. Keywords & Identifiers
- [x] 53 reserved words in Java (50 keywords + 3 literals)
- [x] Used keywords (48), unused keywords (const, goto)
- [x] Special literals: true, false, null
- [x] Identifier rules (allowed chars, no starting with digit, case-sensitive)
- [x] Keyword categories: datatype, control flow, OOP, access, exception, etc.

### 8. Wrapper Classes
- [x] Why wrapper classes? (Collections need objects, not primitives)
- [x] Primitive → Wrapper mapping (int → Integer, char → Character, etc.)
- [x] Autoboxing: primitive → object (automatic)
- [x] Unboxing: object → primitive (automatic)
- [x] Methods: parseInt, valueOf, xxxValue, toString, compareTo, equals, hashCode
- [x] min, max, sum, compare, isNaN, isInfinite, decode, parseBoolean
- [x] Integer cache (-128 to 127) — why a==b is true for 100 but false for 200
- [x] Use `.equals()` for objects, `==` for primitives

### 9. Decision Making
- [x] if, if-else, if-else-if, nested-if
- [x] Ternary operator
- [x] switch statement
- [x] Enhanced switch (Java 14+) with arrow syntax
- [x] Case labels must be literals or constants (no variables)
- [x] Multiple labels in one case (Java 14+)

### 10. Loops
- [x] for loop (initialization; condition; inc/dec)
- [x] for-each loop (for arrays/collections)
- [x] while loop (pre-check condition)
- [x] do-while loop (executes at least once)
- [x] Infinite loop variants: for(;;), for(;true;)

### 11. Jump Statements
- [x] continue → skips current iteration
- [x] break → exits the loop entirely
- [x] return → exits method with or without a value
- [x] break with labels (goto alternative in Java)

### 12. Methods
- [x] Why use methods? (Reusability, Modularity, Readability)
- [x] Method structure: modifier return-type name(params) { body }
- [x] Instance methods (need object to call)
- [x] Static methods (no object needed, can't access instance vars directly)
- [x] Getters and Setters
- [x] Predefined vs User-defined methods
- [x] Method Call Stack — how JVM manages method calls (LIFO)
- [x] Stack frames — created on call, destroyed on return

### 13. Access Modifiers
- [x] private → same class only
- [x] default (no keyword) → same package only
- [x] protected → same package + subclasses in other packages
- [x] public → accessible everywhere
- [x] Top-level classes cannot be private
- [x] Encapsulation using private + getters/setters

---

## 🎯 Next Steps

- [ ] OOP Concepts (Classes, Objects, Constructors)
- [ ] Inheritance
- [ ] Polymorphism
- [ ] Abstraction & Interfaces
- [ ] Exception Handling
- [ ] Collections Framework
- [ ] Generics
- [ ] File I/O
- [ ] Multithreading

---

*Last updated: April 2026*
