# Java Reference Equality

In Java, reference equality compares whether two objects refer to the same memory location. It checks if two object references point to the exact same object in memory. The `==` operator is used for reference equality comparison.

```java
String str1 = "Hello";
String str2 = "Hello";
boolean result = (str1 == str2); // true
```

In the example above, the `==` operator compares the references of `str1` and `str2`. Since both variables refer to the same string literal in memory, the result is `true`.

Reference equality can be used to determine if two variables are referring to the exact same object instance. It is useful when you want to check if two object references point to the identical object in memory.

```java
String str1 = "Hello";
String str2 = new String("Hello");
boolean result = (str1 == str2); // false
```

In the example above, the `==` operator compares the references of `str1` and `str2`. Even though the content of the strings is the same, `str1` and `str2` are different objects in memory. Therefore, the result is `false` for the reference equality comparison.

It's important to note that reference equality comparison is not affected by the content of the objects. It solely checks whether the object references point to the same memory location. Even if the objects have the same content, if they are different instances in memory, the reference equality comparison will yield `false`.

Reference equality is particularly useful when you need to check if two object references are referring to the exact same instance. However, if you want to compare the content or values of objects, you should use the `equals()` method for proper content comparison.
