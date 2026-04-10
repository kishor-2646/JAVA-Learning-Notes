# 09 — Decision Making in Java (Conditional Statements)

## Types of Decision Making Statements

```
Decision Making Statements
├── if-else
│   ├── if(cond)
│   ├── if-else
│   ├── if-else-if
│   └── nested-if
├── Ternary → (condition) ? true : false
└── Switch
    └── Enhanced Switch (Java 14+)
```

---

## 1. `if`

```java
if (cond) {
    // true
}
```

## 2. `if-else`

```java
if (cond) {
    // true
} else {
    // false
}
```

## 3. `if-else-if`

```java
if (cond) {
    // true
} else if (cond2) {
    // true
} else {
    // false
}
```

## 4. Nested `if`

```java
if (cond) {
    if (cond) {
        // true
    } else {
        // false
    }
} else {
    // false
}
```

---

## 5. Ternary Operator

```java
(condition) ? true : false;
```

Example:
```java
int a = 5, b = 10;
int max = (a > b) ? a : b;  // max = 10
```

---

## 6. Switch Statement

```java
switch (expression) {
    case 1:
        // ...
        break;
    case 2:
        // ...
        break;
    case 3:
        // ...
        break;
    default:
        // ...
}
```

> **Note:** Case labels must be **literals or constants**, variable not allowed.

---

## 7. Enhanced Switch Case (Java 14+)

```java
String result = switch (day) {  // Returning a value directly
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3, 4, 5 -> "Midweek";  // Multiple labels in one case
    default -> "Unknown";
};
```

- Uses arrow `->` syntax
- Can return value directly
- Multiple labels in one case → `case 3, 4, 5 ->`
- Case labels must be literals or constants, **variable not allowed**
