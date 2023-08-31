# Java Logical Operators

In Java, logical operators are used to combine and manipulate boolean values. They allow you to perform logical operations such as logical AND, logical OR, and logical NOT.

## Logical AND (`&&`)

The logical AND operator `&&` returns `true` if both operands are `true`, and `false` otherwise.

```java
boolean a = true;
boolean b = false;
boolean result = a && b; // false
```

In the example above, `result` will be `false` because `b` is `false`, regardless of the value of `a`.

## Logical OR (`||`)

The logical OR operator `||` returns `true` if at least one of the operands is `true`, and `false` if both operands are `false`.

```java
boolean a = true;
boolean b = false;
boolean result = a || b; // true
```

In the example above, `result` will be `true` because `a` is `true`, regardless of the value of `b`.

## Logical NOT (`!`)

The logical NOT operator `!` is a unary operator that negates the value of its operand. It returns `true` if the operand is `false`, and `false` if the operand is `true`.

```java
boolean a = true;
boolean result = !a; // false
```

In the example above, `result` will be `false` because `!a` negates the value of `a`, which is `true`.

## Short-Circuit Evaluation

One important behavior of logical operators in Java is short-circuit evaluation. In an expression involving logical AND (`&&`), if the left operand is `false`, the right operand is not evaluated because the overall result will always be `false`. Similarly, in an expression involving logical OR (`||`), if the left operand is `true`, the right operand is not evaluated because the overall result will always be `true`. This behavior helps optimize the evaluation of logical expressions.

```java
boolean a = false;
boolean b = true;
boolean result = a && (5 / 0 > 1); // Since 'a' is false, the division by zero is not evaluated
```

In the example above, the expression `(5 / 0 > 1)` is never evaluated because `a` is `false`, and the overall result of the logical AND operation will always be `false`.

## Usage Example

```java
boolean isRainy = true;
boolean hasUmbrella = false;
boolean isGoingOut = isRainy && !hasUmbrella;

if (isGoingOut) {
    System.out.println("Take an umbrella!");
} else {
    System.out.println("Stay indoors.");
}
```

In the example above, we use logical operators to determine whether to go out or stay indoors based on the values of `isRainy` and `hasUmbrella`. If `isRainy` is `true` and `hasUmbrella` is `false`, `isGoingOut` will be `true`. In this case, the program will print "Take an umbrella!" indicating that the person should take an umbrella. Otherwise, if `isGoingOut` is `false`, the program will print "Stay indoors."

Logical operators in Java allow you to combine boolean values and make logical decisions based on the results of these operations. They are essential for creating conditional statements and controlling the flow of your program based on various conditions.
