# Java Integer Data Type

The `int` data type in Java represents a 32-bit signed integer. It is a primitive data type used to store whole numbers within a range of approximately -2.1 billion to 2.1 billion (-2^31 to 2^31 - 1).

## Class Integer

The `Integer` class is a wrapper class for the `int` data type in Java. It provides various utility methods to work with `int` values. However, when declaring variables of the `int` type directly, you don't need to use the `Integer` class explicitly.

## Fields

- `MIN_VALUE` - The minimum value that an `int` can represent. It is -2,147,483,648.
- `MAX_VALUE` - The maximum value that an `int` can represent. It is 2,147,483,647.

## Methods

The `int` data type does not define any methods of its own. However, it can be used in various arithmetic and logical operations in Java, utilizing the available methods from other classes, such as `java.lang.Math` and `java.util.Arrays`.

## Usage Example

```java
int temperature = 25;
System.out.println("The current temperature is: " + temperature);

int numberOfStudents = 100;
System.out.println("The number of students in the class is: " + numberOfStudents);

int a = 10;
int b = 20;
int sum = a + b;
System.out.println("The sum of a and b is: " + sum);

int difference = b - a;
System.out.println("The difference between b and a is: " + difference);
```

In the example above, we declare an `int` variable named `temperature` to store the current temperature. The value `25` is assigned to it, and we print the temperature to the console.

We also declare an `int` variable named `numberOfStudents` to store the number of students in a class. The value `100` is assigned to it, and we print the number of students to the console.

The example demonstrates arithmetic operations using `int` variables. We declare `int` variables `a` and `b` and assign values `10` and `20` to them, respectively. We perform addition and subtraction operations and store the results in `int` variables `sum` and `difference`.

By using the `int` data type, you can efficiently store and manipulate whole numbers within a wide range of values.
