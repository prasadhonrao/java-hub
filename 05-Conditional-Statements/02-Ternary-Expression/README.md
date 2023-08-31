# Java Ternary Expression

In Java, the ternary expression (also known as the conditional operator) provides a concise way to write conditional expressions that evaluate to different values based on a condition. It has the following syntax:

```java
result = condition ? value1 : value2;
```

Here's how the ternary expression works:

1. The `condition` is evaluated, and if it is `true`, the value of `value1` is assigned to `result`.
2. If the `condition` is `false`, the value of `value2` is assigned to `result`.

The ternary expression can be used as a compact alternative to `if-else` statements when assigning a value based on a condition.

Here's an example that demonstrates the usage of the ternary expression:

```java
int num = 5;
String message = (num > 0) ? "Positive number" : "Non-positive number";
System.out.println(message);
```

In the example above, the condition `(num > 0)` is evaluated. Since `num` is 5 and the condition is `true`, the value `"Positive number"` is assigned to the `message` variable. The resulting output is "Positive number".

The ternary expression can also be nested to handle more complex conditions:

```java
int num = 10;
String message = (num > 0) ? ((num % 2 == 0) ? "Even positive number" : "Odd positive number") : "Non-positive number";
System.out.println(message);
```

In this example, the ternary expression is nested to check if the number is positive and even or positive and odd. If `num` is 10, which is a positive even number, the value `"Even positive number"` is assigned to `message`. The resulting output is "Even positive number".

It's important to note that the ternary expression should be used judiciously to maintain code readability. Complex or nested ternary expressions can make the code harder to understand. In such cases, it may be preferable to use `if-else` statements for improved clarity.

The ternary expression is a useful construct in Java for concise conditional assignments. It allows you to quickly assign different values based on a condition, reducing the amount of code required.
