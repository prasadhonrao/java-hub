# Java Unary Operators

In Java, unary operators are used to perform operations on a single operand. They can be used with various data types, including numeric types and boolean types, to modify or manipulate their values.

## Increment (`++`)

The increment operator `++` is used to increase the value of its operand by 1.

```java
int num = 5;
num++; // Equivalent to num = num + 1 or num += 1
System.out.println(num); // 6
```

In the example above, the value of `num` is initially `5`. After the increment operation `num++`, the value of `num` becomes `6`.

## Decrement (`--`)

The decrement operator `--` is used to decrease the value of its operand by 1.

```java
int num = 5;
num--; // Equivalent to num = num - 1 or num -= 1
System.out.println(num); // 4
```

In the example above, the value of `num` is initially `5`. After the decrement operation `num--`, the value of `num` becomes `4`.

## Unary Plus (`+`)

The unary plus operator `+` is used to indicate the positive sign of a numeric operand. It doesn't have any effect on the operand's value.

```java
int num = -5;
int result = +num; // Equivalent to result = num
System.out.println(result); // -5
```

In the example above, the unary plus operator `+` is applied to the variable `num`, but it doesn't change the value of `num`. The resulting value is assigned to `result`, which remains `-5`.

## Unary Minus (`-`)

The unary minus operator `-` is used to indicate the negative sign of a numeric operand. It negates the value of the operand.

```java
int num = 5;
int result = -num;
System.out.println(result); // -5
```

In the example above, the unary minus operator `-` is applied to the variable `num`, resulting in the negation of its value. The resulting value is assigned to `result`, which becomes `-5`.

## Logical Negation (`!`)

The logical negation operator `!` is used to invert the logical value of a boolean operand. It returns `true` if the operand is `false`, and `false` if the operand is `true`.

```java
boolean flag = true;
boolean result = !flag; // false
System.out.println(result); // false
```

In the example above, the logical negation operator `!` is applied to the boolean variable `flag`, inverting its value. The resulting value is assigned to `result`, which becomes `false`.

Unary operators in Java provide a way to modify or manipulate the value of a single operand. They are commonly used for incrementing or decrementing values, indicating positive or negative signs, and inverting logical values. Understanding and correctly applying unary operators can enhance the functionality and efficiency of your Java programs.
