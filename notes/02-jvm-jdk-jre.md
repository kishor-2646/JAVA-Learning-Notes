# 02 — JVM / JDK / JRE Architecture

## How Java Code Runs

```
You write code → JDK compiles → JRE runs → JVM executes
```

1. Code is written in a file like `HelloWorld.java`
2. Java Compiler `javac` compiles it into bytecode file `HelloWorld.class`
3. JVM (Java Virtual Machine) reads `.class` file and interprets the bytecode
4. JVM converts bytecode to Machine readable code (binary: 0s and 1s) and executes the program

## Why Java is Platform Independent?
- When `.java` is compiled, bytecode (`.class` file) is created
- This bytecode can run on **all OS**
- Each OS has its own JVM (platform-dependent):
  - Windows → Windows JVM
  - Linux → Linux JVM
  - Mac → Mac JVM
- JVM understands bytecode and converts it into native machine code
- Java has ability of **"WORA" — Write Once, Run Anywhere**

> C/C++ provides machine code directly when compiled (OS-specific). That's why Java converts to "bytecode" not "machine code" — then JVM converts bytecode to machine code.

---

## JDK — Java Development Kit
- A complete package for **developers** to create Java programs
- Provides tools and libraries to develop Java applications, working with JRE & JVM
- **Only needed for development**, not for running Java programs
- Platform-dependent (different version for Windows, Linux, macOS)

### JDK = JRE + Development Tools

| Tool | Purpose |
|------|---------|
| `javac` | Converts `.java` → `.class` (bytecode) |
| `java` | Runs the program |
| `jar` | Packages files |
| `javadoc` | Generates documentation |
| `debugger` | Helps find errors |

---

## JRE — Java Runtime Environment
- Environment required to **run** Java programs
- Intended for end-users who only need to execute applications
- Does **not** include development tools
- Does **not** support compilation or debugging
- Platform-dependent (different builds for different OS)

### JRE contains:
1. JVM (execution engine)
2. Libraries (predefined classes like Strings, ArrayList, etc.)

### Work Process:
1. Loads `.class` file to memory
2. Verifies the bytecode (Security)
3. Sends it to JVM for execution

---

## JVM — Java Virtual Machine
- Core component of JRE that allows Java program to run on any platform without modifications
- Engine that **actually runs** your program — converts bytecode → machine code
- JVM loads the bytecode, verifies it, links it, and then executes it

### JVM Components

#### 1. Class Loader Subsystem
Responsible for three activities:
- **Loading**: Reads `.class` files, stores class metadata in method area, creates Class object in heap
- **Linking**:
  - Verification → Ensures bytecode follows JVM rules and is safe to execute
  - Preparation → Allocates memory for static variables, assigns default values
  - Resolution → Converts symbolic references into direct memory references
- **Initialization**: Assigns actual values to static variables, executes static blocks

**Class Loader Types:**
- Bootstrap Class Loader → loads core Java classes
- Extension Class Loader → loads classes from extensions directory
- System/Application Class Loader → loads classes from application classpath

#### 2. JVM Memory Areas

| Area | Description |
|------|-------------|
| Method Area | Stores class-level info (classname, parent class, methods, variables, static data) — shared across JVM |
| Heap | Stores all objects — shared across JVM |
| Stack | Each thread has its own runtime stack — stores method calls, local variables in stack frames — destroyed when thread ends |
| PC Registers | Holds the address of current executing instruction of each thread |
| Native Method Stack | Each thread has a separate stack for native method execution |

#### 3. Execution Engine
- Executes the `.class` (bytecode)
- Reads bytecode line by line
- Uses data and info present in various memory areas

Three parts:
- **Interpreter** → Interprets bytecode line by line. When one method called multiple times, every time interpretation is required (slow)
- **Just-In-Time Compiler (JIT)** → Compiles entire bytecode and changes it to native code so whenever interpreter sees repeated method calls, JIT provides native code for that part. No need for interpretation again → efficiency increases
- **Garbage Collector** → Destroys un-referenced objects

#### 4. Java Native Interface (JNI)
- Interface that interacts with Native Method Libraries
- Provides the native libraries (C, C++) required for execution
- Enables JVM to call C/C++ libraries and to be called by C/C++ libraries specific to hardware

#### 5. Native Method Libraries
- Collections of native libraries required for executing native methods
- Include libraries written in C and C++
