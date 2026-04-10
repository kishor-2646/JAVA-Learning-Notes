# 07 — Java Keywords & Identifiers

## Java Keywords

- Keywords are **reserved words** that have some predefined meanings and are used by the Java compiler for some internal process
- These words **cannot be used as identifiers** such as variable names, method names, class names, or object names

### Java Keywords List (As of Java 21)

- There are **53 keywords** in Java:
  - Used keywords = 48
  - Unused keywords = 2 (`const`, `goto`)
  - Literals = 3 (`true`, `false`, `null`)

```
Reserved Words (53)
├── Keywords (50)
│   ├── Used Keywords (48) → if, else, for, while, ...
│   └── Unused Keywords (2) → const, goto
└── Reserved Literals (3) → true, false, null
```

### Data Type Keywords
1. boolean
2. byte
3. char
4. short
5. int
6. float
7. double
8. void

### Control Flow Keywords
1. if
2. else
3. switch
4. case
5. default
6. for
7. while
8. do
9. break
10. continue
11. return

### Exception Handling Keywords
1. try
2. catch
3. finally
4. throw
5. throws
6. assert

### Object-Oriented Keywords
1. class
2. interface
3. extends
4. implements
5. new
6. this
7. super
8. abstract
9. final
10. static
11. sealed
12. permits

### Access Control Keywords
1. public
2. protected
3. private

### Package and Import Keywords
1. package
2. import

### Multithreading & Synchronization
1. synchronized
2. volatile

### Modifier & Utility
1. strictfp

### Memory Management
1. transient
2. native

### Reserved (Unused)
1. `const`
2. `goto`

### Special Literals
1. `true`
2. `false`
3. `null`

> **Note:** All keywords are reserved words.  
> Reserved words = Keywords + future reserved words

---

## Java Identifiers

- An identifier in Java is the **name given to variables, classes, methods, packages, interfaces**, etc.
- Example: `int x = 9;` → here `x` is the identifier

### Rules for Identifiers

1. Allowed characters: `[A-Z]`, `[a-z]`, `[0-9]`, `$` (dollar), `_` (underscore)
2. Identifiers should **not start with digits** `[0-9]`
3. **Case-sensitive**
4. No limits to length of identifier
5. **Reserved words can't be used** as identifiers

### Valid vs Invalid Examples

| Valid ✓ | Invalid ✗ |
|---------|----------|
| `MyVariable` | `My Variable` (space not allowed) |
| `MYVARIABLE` | `123geeks` (starts with digit) |
| `myvariable` | `a+b` (+ not allowed) |
| `x` | `variable-2` (- not allowed) |
| `i` | `sum-&-diff` (& not allowed) |
| `_score` | |
| `$score` | |
| `sum_of` | |
| `geeks123` | |

### Special Case: `Integer` as identifier
- `Integer` is not a keyword, so it **can** be used as identifier
- But it's **not recommended** — it shadows the wrapper class
```java
Integer x = 10;   // uses it as identifier — valid but confusing
Integer = 5;      // also valid but may not work properly
```
