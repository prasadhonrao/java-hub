# Java Negation Operator

In Java, the negation operator (`-`) is a unary operator that negates the value of its operand. It is commonly used to change the sign of a numeric value.

## Numeric Negation

The negation operator is primarily used with numeric values, such as integers or floating-point numbers. It changes the sign of the value, making a positive value negative, and vice versa.

```java
int num = 5;
int negatedNum = -num; // -5
```

In the example above, the negation operator `-` is applied to the variable `num`, resulting in `negatedNum` being assigned the value `-5`.

## Boolean Negation

The negation operator can also be used with boolean values to invert their logical value. It is denoted by the exclamation mark (`!`) symbol.

```java
boolean flag = true;
boolean negatedFlag = !flag; // false
```

In the example above, the negation operator `!` is used to negate the value of the boolean variable `flag`, resulting in `negatedFlag` being assigned the value `false`.

## Usage Example

```java
int temperature = 30;
boolean isHot = temperature > 25;
boolean isCold = !isHot;

System.out.println("Is it hot? " + isHot); // Is it hot? true
System.out.println("Is it cold? " + isCold); // Is it cold? false
```

In the example above, we use the negation operator to determine whether it is hot or cold based on the `temperature` value. If the `temperature` is greater than `25`, `isHot` is set to `true`. We then use the negation operator `!` to assign the opposite value to `isCold`. The resulting values of `isHot` and `isCold` are printed to the console.

The negation operator is a powerful tool in Java for changing the sign of numeric values and inverting the logical value of boolean expressions. It provides flexibility in manipulating values and conditions in your Java programs.
