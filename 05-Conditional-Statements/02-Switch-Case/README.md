# Java `switch-case` Statement

In Java, the `switch-case` statement provides a way to perform different actions based on the value of a variable or an expression. It allows you to specify multiple alternative code blocks, each associated with a specific value or set of values. The `switch-case` statement has the following syntax:

```java
switch (expression) {
    case value1:
        // code to be executed if the expression matches value1
        break;
    case value2:
        // code to be executed if the expression matches value2
        break;
    // more cases...
    default:
        // code to be executed if none of the cases match
        break;
}
```

Here's how the `switch-case` statement works:

1. The `expression` is evaluated to determine its value.
2. The value of the `expression` is compared against each `case` value specified in the `switch` statement.
3. If a `case` value matches the value of the `expression`, the corresponding code block is executed. The `break` statement is used to exit the `switch` block and prevent execution of subsequent code blocks.
4. If none of the `case` values match the value of the `expression`, the code block associated with the `default` case is executed. The `default` case is optional and can be placed anywhere within the `switch` statement. It serves as the default action when no other cases match.
5. After executing the code block of a matching case or the default case, the program continues to the statement following the `switch` block.

Here's an example that demonstrates the usage of the `switch-case` statement:

```java
int dayOfWeek = 4;
String dayName;

switch (dayOfWeek) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
    case 7:
        dayName = "Sunday";
        break;
    default:
        dayName = "Invalid day";
        break;
}

System.out.println("The day is: " + dayName);
```

In the example above, the `switch-case` statement is used to assign the corresponding day name to the `dayName` variable based on the value of `dayOfWeek`. Since `dayOfWeek` is 4, the code block associated with `case 4` is executed, and the value of `dayName` is set to "Thursday". The resulting output is "The day is: Thursday".

It's important to note the following details about the `switch-case` statement:

- Each `case` value must be unique within the `switch` statement.
- The `break` statement is used to exit the `switch` block and prevent execution of subsequent code blocks. Without the `break` statement, execution will "fall through" to the next case, executing subsequent code blocks until a `break` statement is encountered or the `switch` block is completed.
- The `default` case is optional and can be used to specify a code block that is executed when none of the other cases match the value of the `expression`.
- The `switch` statement can be used with different types, including `char`, `byte`, `short`, `int`, `enum`, and `String` (since Java 7).

The `switch-case` statement provides a concise way to handle multiple possible values of a variable.
