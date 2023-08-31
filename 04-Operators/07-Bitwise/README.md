# Java Bitwise Operators

In Java, bitwise operators are used to perform operations on individual bits of integer types. They allow you to manipulate and perform logical operations at the bit level.

Java provides the following bitwise operators:

- Bitwise AND (`&`)
- Bitwise OR (`|`)
- Bitwise XOR (`^`)
- Bitwise NOT (`~`)
- Left Shift (`<<`)
- Right Shift (`>>`)
- Unsigned Right Shift (`>>>`)

## Bitwise AND (`&`)

The bitwise AND operator `&` performs a bitwise AND operation between the corresponding bits of two operands. It returns `1` if both bits are `1`, otherwise `0`.

```java
int num1 = 5;     // binary: 00000101
int num2 = 3;     // binary: 00000011
int result = num1 & num2; // binary: 00000001 (decimal: 1)
```

In the example above, the bitwise AND operator `&` is used to perform the bitwise AND operation between `num1` and `num2`. The resulting value is stored in `result`, which is `1` in decimal representation.

## Bitwise OR (`|`)

The bitwise OR operator `|` performs a bitwise OR operation between the corresponding bits of two operands. It returns `1` if either of the bits is `1`, otherwise `0`.

```java
int num1 = 5;     // binary: 00000101
int num2 = 3;     // binary: 00000011
int result = num1 | num2; // binary: 00000111 (decimal: 7)
```

In the example above, the bitwise OR operator `|` is used to perform the bitwise OR operation between `num1` and `num2`. The resulting value is stored in `result`, which is `7` in decimal representation.

## Bitwise XOR (`^`)

The bitwise XOR operator `^` performs a bitwise exclusive OR operation between the corresponding bits of two operands. It returns `1` if the bits are different (one `0` and one `1`), otherwise `0`.

```java
int num1 = 5;     // binary: 00000101
int num2 = 3;     // binary: 00000011
int result = num1 ^ num2; // binary: 00000110 (decimal: 6)
```

In the example above, the bitwise XOR operator `^` is used to perform the bitwise XOR operation between `num1` and `num2`. The resulting value is stored in `result`, which is `6` in decimal representation.

## Bitwise NOT (`~`)

The bitwise NOT operator `~` performs a bitwise complement operation on a single operand. It inverts each bit of the operand, resulting in a one's complement representation.

```java
int num = 5;     // binary: 00000101
int result = ~num; // binary: 11111010 (decimal: -6)
```

In the example above, the bitwise NOT operator `~` is used to perform the bitwise complement operation on `num`. The resulting value is stored in `result`, which is `-6` in decimal representation.

## Left Shift (`<<`)

The left shift operator `<<` shifts the bits of the left-hand operand to the left by a specified number of positions. Zeros are filled in on the right side.

```java
int num = 5;     // binary: 00000101
int result = num << 2; // binary: 00010100 (decimal: 20)
```

In the example above

, the left shift operator `<<` is used to shift the bits of `num` two positions to the left. The resulting value is stored in `result`, which is `20` in decimal representation.

## Right Shift (`>>`)

The right shift operator `>>` shifts the bits of the left-hand operand to the right by a specified number of positions. For signed integers, the most significant bit (sign bit) is preserved, and the vacant bits are filled with the sign bit.

```java
int num = -10;    // binary: 11111111111111111111111111110110
int result = num >> 2; // binary: 11111111111111111111111111111101 (decimal: -3)
```

In the example above, the right shift operator `>>` is used to shift the bits of `num` two positions to the right. The resulting value is stored in `result`, which is `-3` in decimal representation.

## Unsigned Right Shift (`>>>`)

The unsigned right shift operator `>>>` shifts the bits of the left-hand operand to the right by a specified number of positions. Zeros are filled in on the left side.

```java
int num = -10;    // binary: 11111111111111111111111111110110
int result = num >>> 2; // binary: 00111111111111111111111111111101 (decimal: 1073741821)
```

In the example above, the unsigned right shift operator `>>>` is used to shift the bits of `num` two positions to the right. The resulting value is stored in `result`, which is `1073741821` in decimal representation.

Bitwise operators in Java allow you to manipulate individual bits of integers. They are useful for performing low-level bit-level operations and bitwise calculations. Understanding and correctly using bitwise operators can be beneficial in scenarios where you need to work with binary representations or perform efficient bit-level operations.
