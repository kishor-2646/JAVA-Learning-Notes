# 08 — Wrapper Classes in Java

## What is a Wrapper Class?

- In Java, **wrapper class allows primitive data types to be represented as Objects**
- This allows primitives to be used in Object-Oriented features such as collections, generics, and APIs that require objects
- Each wrapper class **encapsulates a corresponding primitive value** inside an object

## Primitive → Wrapper Class Mapping

| Primitive | Wrapper Class | Example |
|-----------|---------------|---------|
| `byte` | `Byte` | `byte b = 1;` → `Byte byteObj = Byte.valueOf(b);` |
| `short` | `Short` | |
| `int` | `Integer` | `int i = 10;` → `Integer intObj = Integer.valueOf(i);` |
| `long` | `Long` | `Integer intObj = Integer.valueOf(i);` |
| `float` | `Float` | `float f = 13.6f;` → `Float floatObj = Float.valueOf(f);` |
| `double` | `Double` | `Double doubleObj = Double.valueOf(d);` |
| `char` | `Character` | `char c = 'a';` → `Character charObj = c;` (autoboxing) |
| `boolean` | `Boolean` | `Character charObj = c;` // autoboxing |

## Why Wrapper Classes Are Needed?

1. **Java Collections** (ArrayList, HashMap, etc.) store only objects, not primitives
2. **Wrapper objects** allow primitives to be used in OOP features like methods, synchronization, and serialization
3. **Objects support null values**, while primitives do not
4. Wrapper class **provides utility methods** such as `compareTo()`, `equals()`, `toString()`

---

## Autoboxing

**Conversion of Primitive data type → Objects (automatic)**

```java
char ch = 'a';
Character c = ch;  // Autoboxing: char → Character

ArrayList<Integer> list = new ArrayList<>();
list.add(25);  // Autoboxing: int → Integer
```

## Unboxing

**Conversion of a wrapper class → primitives (automatic)**

```java
Character ch = 'a';
char c = ch;  // Unboxing: Character → char

ArrayList<Integer> list = new ArrayList<>();
list.add(84);
int n = list.get(0);  // Unboxing: Integer → int
```

---

## Methods of Wrapper Class

### 1. `parseXxx(String s)`
Converts a String into given primitive type
```java
int a = Integer.parseInt("100");
sout(a);  // 100 → primitive
```

### 2. `valueOf(String s)`
Converts String into a wrapper object
```java
Integer a = Integer.valueOf("100");
sout(a);  // 100 → object
```

### 3. `valueOf(primitive)`
Converts primitive value into wrapper object
```java
Integer a = Integer.valueOf(10);
sout(a);  // 10
```

### 4. `xxxValue()`
Converts wrapper object into its primitive type
```java
Integer obj = 50;
int a = obj.intValue();
sout(a);  // 50
```

### 5. `toString()`
Converts wrapper object into a String
```java
String s = Integer.toString(10);
sout(s);  // "10"
```

### 6. `compareTo(Xxx obj)`
Compares two wrapper objects
```java
Integer a = 10, b = 20;
sout(a.compareTo(b));  // -1
```
- `a < b` → `-1`
- `a == b` → `0`
- `a > b` → `1`

### 7. `equals(Object obj)`
Compares values, not references
```java
Integer a = 100, b = 100;
sout(a.equals(b));  // true
```

### 8. `hashCode()`
Returns hash code of the object
- For Integer: `hashCode = value`
- For String: `hashCode = random value`
```java
Integer a = 100;
sout(a.hashCode());  // 100
```

### 9. `min(x, y)`, `max(x, y)`, `sum(x, y)`
```java
Integer.min(10, 20);  // 10
Integer.max(10, 20);  // 20
Integer.sum(10, 20);  // 30
```

### 10. `compare(x, y)`
Compares two primitive values (same logic as `compareTo()`)
- `compare()` → primitive, `compareTo()` → wrapper

### 11. `isNaN()`
Checks if value is Not a Number (Float/Double only)
```java
double val = 0.0 / 0.0;
sout(Double.isNaN(val));  // true
```

### 12. `isInfinite()`
Checks infinite value (Float/Double only)
```java
double val = 10.0 / 0.0;
sout(Double.isInfinite(val));  // true
```

### 13. `decode(String s)`
Decodes decimal, hex, or octal string
```java
Integer.decode("0XA");  // 10 (hex)
Integer.decode("010");  // 8  (octal)
Integer.decode("10");   // 10 (decimal)
```

### 14. `parseBoolean(String s)`
Converts string to boolean
- Only `"true"` → `true`
- Everything else → `false`

---

## Integer Cache (-128 to 127)

```java
Integer a = 100;  Integer b = 100;
sout(a == b);  // TRUE

Integer a = 200;  Integer b = 200;
sout(a == b);  // FALSE
```

**Why?**
- Java has a cache range: **-128 to 127**
- Within this range: same object is reused → no new object is created
- Outside this range: new object created every time
- `==` compares references (memory address) → different objects → `false`

**Rules:**
1. Use `==` for primitive (`int`, `double`, etc.)
2. Use `.equals()` for Objects — because it compares values, not references
