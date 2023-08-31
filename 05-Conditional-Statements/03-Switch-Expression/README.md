# Java Switch Expression

In Java 14 and later versions, the `switch` statement has been enhanced to support switch expressions. Switch expressions provide a more concise and expressive way to evaluate a single expression based on multiple possible values. The switch expression has the following syntax:

```java
result = switch (expression) {
    case value1 -> expression1;
    case value2 -> expression2;
    // more cases...
    default -> expressionN;
};
```

Here's how the switch expression works:

1. The `expression` is evaluated, and its value is compared against each `case` value specified in the switch expression.
2. If a `case` value matches the value of the `expression`, the corresponding `expressionN` is evaluated and becomes the value of the switch expression.
3. The `->` arrow is used to separate the `case` value from the expression to be evaluated.
4. The `default` case is optional and is used when none of the cases match the value of the `expression`. The `expressionN` associated with the `default` case is evaluated and becomes the value of the switch expression.
5. The value of the switch expression is assigned to the `result` variable.

Here's an example that demonstrates the usage of switch expressions:

```java
int dayOfWeek = 3;

String dayName = switch (dayOfWeek) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    case 7 -> "Sunday";
    default -> "Invalid day";
};

System.out.println("The day is: " + dayName);
```

In the example above, the switch expression is used to assign the corresponding day name to the `dayName` variable based on the value of `dayOfWeek`. Since `dayOfWeek` is 3, the expression `"Wednesday"` is evaluated and assigned to `dayName`. The resulting output is "The day is: Wednesday".

Switch expressions also support multiple labels per case, separated by commas. This allows you to handle multiple matching cases with a single expression:

```java
int num = 10;

String category = switch (num) {
    case 1, 2, 3 -> "Low";
    case 4, 5, 6 -> "Medium";
    case 7, 8, 9 -> "High";
    default -> "Invalid category";
};

System.out.println("The category is: " + category);
```

In this example, the switch expression assigns the corresponding category ("Low", "Medium", or "High") based on the value of `num`. The resulting output is "The category is: Medium" because `num` is 10, which falls under the range of values associated with the "Medium" category.

Switch expressions offer improved readability and compactness compared to traditional switch statements, especially when assigning a value based on a condition. They eliminate the need for break statements and provide a more concise syntax for handling different cases.

Note that switch expressions are a feature introduced in Java 14 and require a compatible Java version or later to be used.
