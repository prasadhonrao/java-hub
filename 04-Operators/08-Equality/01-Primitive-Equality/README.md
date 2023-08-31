# Java Primitive Equality

In Java, primitive types (such as `int`, `double`, `boolean`, etc.) have their own equality comparison rules. The equality comparison for primitive types is straightforward and based on the value of the variables.

The equality comparison for different primitive types is as follows:

## Numeric Types (`byte`, `short`, `int`, `long`, `float`, `double`)

For numeric types, such as `byte`, `short`, `int`, `long`, `float`, and `double`, the equality comparison is performed by comparing their values.

```java
int num1 = 5;
int num2 = 5;
boolean result = (num1 == num2); // true
```

In the example above, the equality comparison `(num1 == num2)` compares the values of `num1` and `num2`. Since both variables have the same value `5`, the result is `true`.

## Character Type (`char`)

For the `char` type, the equality comparison is performed by comparing their Unicode values.

```java
char ch1 = 'A';
char ch2 = 'A';
boolean result = (ch1 == ch2); // true
```

In the example above, the equality comparison `(ch1 == ch2)` compares the Unicode values of `ch1` and `ch2`. Since both characters are `'A'`, the result is `true`.

## Boolean Type (`boolean`)

For the `boolean` type, the equality comparison is performed by directly comparing their boolean values.

```java
boolean flag1 = true;
boolean flag2 = false;
boolean result = (flag1 == flag2); // false
```

In the example above, the equality comparison `(flag1 == flag2)` compares the boolean values of `flag1` and `flag2`. Since they have different boolean values (`true` and `false`), the result is `false`.

Primitive equality comparison in Java is straightforward and depends on the values of the variables. By comparing the values of primitive variables using the equality operator (`==`), you can determine whether they are equal or not.
