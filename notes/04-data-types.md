# 04 — Java Data Types

## Overview

```
Data Types
├── Primitive
│   ├── Non-numeric: boolean, char
│   └── Numeric
│       ├── Integer: byte, short, int, long
│       └── Floating-point: float, double
└── Non-primitive: String, Array, etc.
```

## Primitive Data Types Table

| Type | Description | Default | Size | Example | Range |
|------|-------------|---------|------|---------|-------|
| boolean | Logical values | false | JVM-defined | true, false | — |
| byte | 8-bit signed integer | 0 | 1 byte | 10 | -128 to 127 |
| char | 16-bit Unicode character | \u0000 | 2 bytes | 'A', '\u0041' | 0 to 65,535 |
| short | 16-bit signed integer | 0 | 2 bytes | 2000 | -32,768 to 32,767 |
| int | 32-bit signed integer | 0 | 4 bytes | 1000, -500 | -2,147,483,648 to 2,147,483,647 |
| long | 64-bit signed integer | 0L | 8 bytes | 1234567891L | ±9.22e18 |
| float | 32-bit floating point | 0.0f | 4 bytes | 3.14f | ~6-7 digits precision |
| double | 64-bit floating point | 0.0d | 8 bytes | 3.14159d | ~15-16 digits precision |

> Formula for range: -2^(n-1) to 2^(n-1)-1 where n = number of bits

## Important Notes
- In Java, any decimal number is treated as `double` by default
- Must use `f` suffix for float: `float z = 0.01f;` ✓
- `float s = 0.01;` → Compile-time error (0.01 is considered double)
- Java does NOT automatically convert double → float
- For double, you do not require `d` suffix (optional)
