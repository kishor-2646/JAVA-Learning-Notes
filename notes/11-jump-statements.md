# 11 — Jump Statements in Java

## Types

1. `continue`
2. `break`
3. `return`

---

## 1. `continue`

→ **Skips the current iteration**

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;
    }
    sout(i);
}
// Output: 0 1 3 4
```

---

## 2. `break`

→ **Breaks the loop, goes out**

```java
for (int i = 0; i < n; i++) {
    if (i == 4) {
        break;
    }
    sout(i);
}
// Output: 0 1 2 3
```

---

## 3. `return`

→ **Used to exit from a method, with or without a value**

```java
public int sum(int n, int m) {
    int sum = n + m;
    // sout;
    return sum;
}

psvm() {
    int res = sum(10, 15);
    sout(res);  // 25
}
```

---

## Use `break` as `goto`

Java doesn't use `goto`. So **`break` is enhanced with labels**.

```java
for (int i = 0; i < 3; i++) {
    one: {   // label one
        two: {  // label two
            three: {  // label three
                sout("i = " + i);
                if (i == 0) break one;    // breaks to label one
                if (i == 1) break two;    // breaks to label two
                if (i == 2) break three;  // breaks to label three
            }
            sout("after label three");
        }
        sout("after label two");
    }
    sout("after label one");
}
```

Output:
```
i = 0
after label one
i = 1
after label two
after label one
i = 2
after label three
after label two
after label one
```

> When `break` executes, control jumps out of the labelled statement or block.
