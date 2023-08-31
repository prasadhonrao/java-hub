# Java String Data Type

The `String` data type in Java represents a sequence of characters. It is not a primitive data type like `int` or `boolean`, but rather a class that provides a convenient way to work with textual data.

## Class String

The `String` class in Java is used to create and manipulate strings. It provides various methods for string manipulation, such as concatenation, substring extraction, length retrieval, and more.

### Usage Example

```java
String message = "Hello, world!";
System.out.println(message);

String name = "Alice";
int age = 25;
String greeting = "Hello, " + name + "! You are " + age + " years old.";
System.out.println(greeting);

String uppercaseName = name.toUpperCase();
System.out.println("Uppercase name: " + uppercaseName);

int messageLength = message.length();
System.out.println("Message length: " + messageLength);

boolean startsWithHello = message.startsWith("Hello");
System.out.println("Starts with 'Hello': " + startsWithHello);

boolean endsWithWorld = message.endsWith("world!");
System.out.println("Ends with 'world!': " + endsWithWorld);
```

In the example above, we declare a `String` variable named `message` to store the string "Hello, world!". We print the value of `message` to the console.

We also demonstrate string concatenation. We declare a `String` variable named `name` to store the name "Alice" and an `int` variable named `age` to store the age 25. We create a new `String` named `greeting` by concatenating different strings and variables together. We print the value of `greeting` to the console.

The example showcases the use of various methods provided by the `String` class. We use the `toUpperCase()` method to convert the `name` string to uppercase and store the result in `uppercaseName`. We print the value of `uppercaseName` to the console.

We also use the `length()` method to retrieve the length of the `message` string and store it in `messageLength`. We print the value of `messageLength` to the console.

Furthermore, we use the `startsWith()` method to check if the `message` string starts with the substring "Hello" and store the result in `startsWithHello`. We print the value of `startsWithHello` to the console.

Lastly, we use the `endsWith()` method to check if the `message` string ends with the substring "world!" and store the result in `endsWithWorld`. We print the value of `endsWithWorld` to the console.

The `String` data type provides a versatile and powerful way to work with textual data in Java. It offers a wide range of methods for manipulating, searching, and extracting information from strings.
