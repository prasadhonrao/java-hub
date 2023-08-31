# Java `if` Statement

In Java, the `if` statement is used for conditional execution. It allows you to specify a block of code that should be executed only if a certain condition is true. The general syntax of the `if` statement is as follows:

```java
if (condition) {
    // code to be executed if the condition is true
}
```

Here's how the `if` statement works:

1. The `condition` is an expression that evaluates to either `true` or `false`.
2. If the `condition` is `true`, the code block enclosed within the curly braces `{}` is executed.
3. If the `condition` is `false`, the code block is skipped, and the program continues to the next statement following the `if` statement.

Here's an example that demonstrates the usage of the `if` statement:

```java
int num = 10;

if (num > 0) {
    System.out.println("The number is positive.");
}
```

In the example above, the `condition` is `num > 0`, which checks if the value of `num` is greater than zero. If the condition is `true`, the message "The number is positive." is printed to the console.

You can also use the `if` statement with an optional `else` clause to specify an alternative code block to execute when the condition is `false`. The `else` clause is executed when the condition in the `if` statement is `false`. Here's an example:

```java
int num = -5;

if (num > 0) {
    System.out.println("The number is positive.");
} else {
    System.out.println("The number is non-positive.");
}
```

In the example above, if the value of `num` is greater than zero, the message "The number is positive." is printed. Otherwise, if the value is non-positive, the message "The number is non-positive." is printed.

The `if` statement can also be nested, allowing for more complex conditional logic by using multiple levels of conditions.

```java
int num = 15;

if (num > 0) {
    System.out.println("The number is positive.");
    if (num % 2 == 0) {
        System.out.println("The number is even.");
    } else {
        System.out.println("The number is odd.");
    }
} else {
    System.out.println("The number is non-positive.");
}
```

In the example above, the nested `if` statement checks whether the number is even or odd, only when the number is positive.

The `if` statement is a fundamental control structure in Java, allowing you to execute different parts of your code based on specified conditions. It provides a way to control the flow of your program and make decisions based on different situations.
