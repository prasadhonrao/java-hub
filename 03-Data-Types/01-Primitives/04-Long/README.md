# Java Long Data Type

The `long` data type in Java represents a 64-bit signed integer. It is a primitive data type used to store whole numbers within a range of approximately -9.2 quintillion to 9.2 quintillion (-2^63 to 2^63 - 1).

## Class Long

The `Long` class is a wrapper class for the `long` data type in Java. It provides various utility methods to work with `long` values. However, when declaring variables of the `long` type directly, you don't need to use the `Long` class explicitly.

### Fields

- `MIN_VALUE` - The minimum value that a `long` can represent. It is -9,223,372,036,854,775,808.
- `MAX_VALUE` - The maximum value that a `long` can represent. It is 9,223,372,036,854,775,807.

### Methods

The `long` data type does not define any methods of its own. However, it can be used in various arithmetic and logical operations in Java, utilizing the available methods from other classes, such as `java.lang.Math` and `java.util.Arrays`.

### Usage Example

```java
long population = 7_900_000_000L;
System.out.println("The current world population is: " + population);

long distanceToSun = 149_600_000L;
System.out.println("The distance from Earth to the Sun is approximately: " + distanceToSun + " kilometers");

long a = 1_000_000_000L;
long b = 2_000_000_000L;
long sum = a + b;
System.out.println("The sum of a and b is: " + sum);

long difference = b - a;
System.out.println("The difference between b and a is: " + difference);
```

In the example above, we declare a `long` variable named `population` to store the current world population. The value `7,900,000,000` is assigned to it, and we print the population to the console.

We also declare a `long` variable named `distanceToSun` to store the distance from Earth to the Sun. The value `149,600,000` is assigned to it, and we print the distance to the console.

The example demonstrates arithmetic operations using `long` variables. We declare `long` variables `a` and `b` and assign values `1,000,000,000` and `2,000,000,000` to them, respectively. We perform addition and subtraction operations and store the results in `long` variables `sum` and `difference`.

By using the `long` data type, you can efficiently store and manipulate whole numbers within a wide range of values.
