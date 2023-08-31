# Java Boolean Data Type

The `boolean` data type in Java represents a boolean value, which can be either `true` or `false`. It is a primitive data type used to store and evaluate logical conditions in a program.

## Class Boolean

The `Boolean` class is a wrapper class for the `boolean` data type in Java. It provides various utility methods to work with `boolean` values. However, when declaring variables of the `boolean` type directly, you don't need to use the `Boolean` class explicitly.

### Fields

The `boolean` data type does not define any fields of its own. It can only have two possible values: `true` or `false`.

### Methods

The `boolean` data type does not define any methods of its own. However, it can be used in logical operations and control flow statements to evaluate conditions.

### Usage Example

```java
boolean isRaining = true;
System.out.println("Is it raining? " + isRaining);

boolean isSunny = false;
System.out.println("Is it sunny? " + isSunny);

boolean hasPassedExam = true;
System.out.println("Has the student passed the exam? " + hasPassedExam);

boolean isEven = 6 % 2 == 0;
System.out.println("Is 6 an even number? " + isEven);
```

In the example above, we declare a `boolean` variable named `isRaining` to store whether it is currently raining. The value `true` is assigned to it, indicating that it is raining. We print the value of `isRaining` to the console.

We also declare a `boolean` variable named `isSunny` to store whether it is currently sunny. The value `false` is assigned to it, indicating that it is not sunny. We print the value of `isSunny` to the console.

The example demonstrates the use of `boolean` variables in different contexts. We have a `boolean` variable `hasPassedExam` to store whether a student has passed an exam. The value `true` is assigned to it, indicating that the student has passed the exam. We print the value of `hasPassedExam` to the console.

Additionally, we have a `boolean` variable `isEven` that uses a logical expression to check if a number (`6` in this case) is even. The expression `6 % 2 == 0` evaluates to `true`, indicating that `6` is indeed an even number. We print the value of `isEven` to the console.

The `boolean` data type is fundamental in decision making, conditional statements, and control flow in Java programs. It allows you to represent and evaluate logical conditions.
