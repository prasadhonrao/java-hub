# Java HashMap

In Java, `HashMap` is a widely used implementation of the `Map` interface that stores key-value pairs. It provides an efficient way to store, retrieve, and manipulate data based on unique keys. `HashMap` allows null values and does not maintain any order of its elements. It provides constant-time performance for basic operations like `get()` and `put()`.

## Importing the HashMap Class

Before using `HashMap`, you need to import the `java.util` package, which contains the `HashMap` class. You can import it at the beginning of your Java file with the following line of code:

```java
import java.util.HashMap;
```

## Creating a HashMap

To create a `HashMap`, you can use the following syntax:

```java
HashMap<keyType, valueType> hashMapName = new HashMap<>();
```

Here, `keyType` represents the type of keys you want to use, `valueType` represents the type of values you want to associate with the keys, and `hashMapName` is the name you choose for your `HashMap` variable. For example, to create a `HashMap` that maps strings to integers, you would use the following code:

```java
HashMap<String, Integer> ages = new HashMap<>();
```

## Adding Key-Value Pairs to a HashMap

To add key-value pairs to a `HashMap`, you can use the `put()` method. The `put()` method takes a key and a value as parameters and associates the value with the key in the `HashMap`. Here's an example:

```java
ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 35);
```

In this example, three key-value pairs are added to the `ages` `HashMap`, where "Alice" is associated with the value 25, "Bob" with 30, and "Charlie" with 35.

## Accessing Values from a HashMap

You can access values from a `HashMap` by providing the corresponding key using the `get()` method. The `get()` method retrieves the value associated with the specified key. Here's an example:

```java
int aliceAge = ages.get("Alice");
```

In this example, the value associated with the key "Alice" is retrieved and stored in the `aliceAge` variable.

## Modifying Values in a HashMap

To modify the value associated with a key in a `HashMap`, you can use the `put()` method again with the same key. Here's an example:

```java
ages.put("Alice", 26);
```

In this example, the value associated with the key "Alice" is updated to 26.

## Removing Key-Value Pairs from a HashMap

To remove a key-value pair from a `HashMap`, you can use the `remove()` method and provide the key of the pair to be removed. Here's an example:

```java
ages.remove("Bob");
```

In this example, the key-value pair with the key "Bob" is removed from the `ages` `HashMap`.

## HashMap Size

The size of a `HashMap` represents the number of key-value pairs it currently holds. You can retrieve the size using the `size()` method. Here's an example:

```java
int size = ages.size();
```

In this example, the variable `size` will contain the number of key-value pairs in the `ages` `HashMap`.

## Other HashMap Operations

`HashMap` provides various methods and operations to work with the collection, such as:

- Checking if a key exists: You can use the `containsKey()` method to check if a specific key exists in the `HashMap`.
- Checking if a value exists: You

 can use the `containsValue()` method to check if a specific value exists in the `HashMap`.

- Iterating over key-value pairs: You can use enhanced `for-each` loops or iterator methods like `keySet()`, `values()`, and `entrySet()` to iterate over the key-value pairs in a `HashMap`.
- Clearing the HashMap: You can use the `clear()` method to remove all key-value pairs from the `HashMap`.

`HashMap` provides a flexible and efficient way to store and retrieve data based on unique keys. It is widely used in various applications and is part of the Java Collections Framework, providing a powerful tool for managing and manipulating key-value pairs.
