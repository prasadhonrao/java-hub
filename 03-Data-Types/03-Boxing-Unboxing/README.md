# Java Boxing and Unboxing

In Java, boxing and unboxing are operations that allow for the conversion between primitive types and their corresponding wrapper classes. Boxing is the process of converting a primitive type to its wrapper class, while unboxing is the process of extracting the primitive value from its wrapper class.

## Boxing

Boxing is the process of converting a primitive type to its corresponding wrapper class. Java provides a set of predefined wrapper classes for each primitive type, as shown below:

- `byte`: `Byte`
- `short`: `Short`
- `int`: `Integer`
- `long`: `Long`
- `float`: `Float`
- `double`: `Double`
- `char`: `Character`
- `boolean`: `Boolean`

Boxing is typically performed implicitly, meaning that the conversion happens automatically by the Java compiler. For example:

```java
int number = 42;
Integer boxedNumber = number; // Boxing (int to Integer)
```

In the example above, the `int` value `42` is automatically boxed to an `Integer` object.

## Unboxing

Unboxing is the process of extracting the primitive value from its corresponding wrapper class. It allows you to convert a wrapper object back to its primitive type. Unboxing is also typically performed implicitly. For example:

```java
Integer boxedNumber = 10;
int number = boxedNumber; // Unboxing (Integer to int)
```

In the example above, the `Integer` object `boxedNumber` is automatically unboxed to an `int` value.

## Usage Example

```java
Integer boxedInt = 42; // Boxing (int to Integer)
Double boxedDouble = 3.14; // Boxing (double to Double)

int unboxedInt = boxedInt; // Unboxing (Integer to int)
double unboxedDouble = boxedDouble; // Unboxing (Double to double)

System.out.println("Boxed Integer: " + boxedInt);
System.out.println("Boxed Double: " + boxedDouble);
System.out.println("Unboxed int: " + unboxedInt);
System.out.println("Unboxed double: " + unboxedDouble);
```

In the example above, we demonstrate the process of boxing and unboxing. We box the `int` value `42` to an `Integer` object using the assignment operator. Similarly, we box the `double` value `3.14` to a `Double` object.

We then unbox the `Integer` object `boxedInt` to an `int` value using the assignment operator. Likewise, we unbox the `Double` object `boxedDouble` to a `double` value.

Finally, we print the values of the boxed `Integer` and `Double` objects, as well as the unboxed `int` and `double` values.

Boxing and unboxing provide a convenient way to bridge the gap between primitive types and their corresponding wrapper classes. They allow for seamless interchangeability when working with primitives and objects, enabling more flexibility and compatibility in Java programs.
