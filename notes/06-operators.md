# 06 — Java Operators

## Types of Operators

| Type | Operators |
|------|-----------|
| Arithmetic | `+`, `-`, `*`, `%`, `/` |
| Logical | `&&`, `\|\|`, `!` |
| Unary | `--`, `++` |
| Ternary | `cond ? true : false` |
| Assignment | `+=`, `-=`, `=`, `/=`, `%=`, `*=` |
| Relational | `>`, `<`, `==`, `<=`, `>=`, `!=` |
| instanceof | `obj instanceof Integer` |
| Bitwise & Shift | `&`, `\|`, `^`, `<<`, `>>`, `>>>` |

---

## Bitwise Operators in Java

- Perform operations directly on **binary representation (bits)** of integer values
- Work only with integer data types: `byte`, `short`, `int`, `long`, `char`

### 1. Bitwise AND (`&`)
```
a = 5  → 0101
b = 7  → 0111
5 & 7  → 0101 → 5 (decimal)
```

### 2. Bitwise OR (`|`)
```
a = 5 → 0101
b = 7 → 0111
a|b   → 0111 → 7
```

### 3. Bitwise XOR (`^`)
- If different → 1, if same → 0
```
a = 5 → 0101
b = 7 → 0111
a^b   → 1010 → 2
```

### 4. Bitwise Complement (`~`)
- 0 becomes 1, 1 becomes 0
- In Java: `~N = -(N+1)`
```
a = 5
~a = -(5+1) = -6
```

---

## Bit-Shift Operators

Shift the binary bits of a number left or right. They work directly on binary data.

1. Signed Left Shift (`<<`)
2. Signed Right Shift (`>>`)
3. Unsigned Right Shift (`>>>`)

### Left Shift (`<<`)
- Shifts each bit to the left → **Multiplies power of 2**
- Left shift x by n positions → `x * 2^n`
```
5 (binary: 101)
5 << 1 → 1010 → 10   (5 * 2¹ = 10)
5 << 2 → 10100 → 20  (5 * 2² = 20)
```

### Signed Right Shift (`>>`)
- Shifts bits to the right → **Divides by powers of two**
- Preserves the sign bit (MSB)
  - If number is positive → 0 is filled on left
  - If number is negative → 1 is filled on left
```
16 >> 2  → 4    (positive → 0 filled on left)
-16 >> 2 → -4   (negative → 1 filled on left, answer in same sign)
```

### Unsigned Right Shift (`>>>`)
- Shifts bits to right but **always fills 0 on left**, regardless of sign
- Does **not** preserve sign bit
- Converts negative number into large positive number
```
16  >>> 2 → 4
-16 >>> 2 → 1073741820  (large positive — sign bit gone)
```

---

## Increment & Decrement Operators

| Type | Order | Effect |
|------|-------|--------|
| Pre-inc (`++x`) | increment → replace | First increment, then use value |
| Post-inc (`x++`) | replace → increment | First use value, then increment |
| Pre-dec (`--x`) | decrement → replace | First decrement, then use value |
| Post-dec (`x--`) | replace → decrement | First use value, then decrement |

### Examples (x = 10):

| Expression | y value | x after |
|------------|---------|---------|
| `y = ++x` | 11 | 11 |
| `y = x++` | 10 | 11 |
| `y = --x` | 9 | 9 |
| `y = x--` | 10 | 9 |

> **Note:** `y = ++(++x)` → Error: Unexpected type.  
> We can't `inc` or `dec` on constants.  
> `++x` → `x = x+1` ✓ but `++6` → `6 = 6+1` ✗

---

## instanceof Operator

- In Java, `instanceof` is a keyword used for checking if a reference variable contains a given type of object reference or not
- Also known as **comparison operator** where the instance is getting compared to type returning boolean `true` or `false`

```java
class GFG {
    psvm() {
        GFG object = new GFG();
        sout(object instanceof GFG);  // true
    }
}
```
