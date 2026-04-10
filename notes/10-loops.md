# 10 — Java Loops

## Types of Loops

1. `for` or `for-each`
2. `while`
3. `do-while`

---

## 1. `for` Loop

```java
for (initialization; condition; inc/dec) {
    // body
}
```

Example:
```java
for (int i = 0; i < 5; i++) {
    // body
}
```

### Valid `for` loop variants

| Syntax | Valid? | Notes |
|--------|--------|-------|
| `for ( ; ; )` | ✓ | Valid — infinite loop |
| `for ( )` | ✗ | Invalid — at least 2 semicolons needed |
| `for (;1)` | ✗ | Invalid |
| `for (int i=0; ;)` | ✓ | Valid — infinite loop |
| `for (;true;)` | ✓ | Valid — infinite loop |
| `for (;;;)` | ✓ | Valid |

---

## 2. `for-each` Loop

Used for arrays and collections:

```java
int[] nums = {1, 2, 3, 4};
for (int n : nums) {
    sout(n);
}
// Output: 1 2 3 4
```

---

## 3. `while` Loop

```java
int i = 0;
while (i < 10) {
    sout(i);
    i++;
}
```

---

## 4. `do-while` Loop

- **Executes at least once** before checking condition

```java
int i = 0;
do {
    sout(i);
    i++;
} while (i < 10);
```
