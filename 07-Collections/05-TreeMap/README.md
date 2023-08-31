# Java TreeMap

In Java, `TreeMap` is an implementation of the `SortedMap` interface that stores key-value pairs in a sorted order based on the natural ordering of the keys or a custom comparator. It provides efficient operations for inserting, retrieving, and deleting elements while maintaining the keys in a sorted manner. `TreeMap` allows null values but does not allow duplicate keys.

## Importing the TreeMap Class

Before using `TreeMap`, you need to import the `java.util` package, which contains the `TreeMap` class. You can import it at the beginning of your Java file with the following line of code:

```java
import java.util.TreeMap;
```

## Creating a TreeMap

To create a `TreeMap`, you can use the following syntax:

```java
TreeMap<keyType, valueType> treeMapName = new TreeMap<>();
```

Here, `keyType` represents the type of keys you want to use, `valueType` represents the type of values you want to associate with the keys, and `treeMapName` is the name you choose for your `TreeMap` variable. For example, to create a `TreeMap` that maps strings to integers, you would use the following code:

```java
TreeMap<String, Integer> ages = new TreeMap<>();
```

## Adding Key-Value Pairs to a TreeMap

To add key-value pairs to a `TreeMap`, you can use the `put()` method. The `put()` method takes a key and a value as parameters and associates the value with the key in the `TreeMap`. Here's an example:

```java
ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 35);
```

In this example, three key-value pairs are added to the `ages` `TreeMap`, where "Alice" is associated with the value 25, "Bob" with 30, and "Charlie" with 35.

## Accessing Values from a TreeMap

You can access values from a `TreeMap` by providing the corresponding key using the `get()` method. The `get()` method retrieves the value associated with the specified key. Here's an example:

```java
int aliceAge = ages.get("Alice");
```

In this example, the value associated with the key "Alice" is retrieved and stored in the `aliceAge` variable.

## Modifying Values in a TreeMap

To modify the value associated with a key in a `TreeMap`, you can use the `put()` method again with the same key. Here's an example:

```java
ages.put("Alice", 26);
```

In this example, the value associated with the key "Alice" is updated to 26.

## Removing Key-Value Pairs from a TreeMap

To remove a key-value pair from a `TreeMap`, you can use the `remove()` method and provide the key of the pair to be removed. Here's an example:

```java
ages.remove("Bob");
```

In this example, the key-value pair with the key "Bob" is removed from the `ages` `TreeMap`.

## TreeMap Size

The size of a `TreeMap` represents the number of key-value pairs it currently holds. You can retrieve the size using the `size()` method. Here's an example:

```java
int size = ages.size();
```

In this example, the variable `size` will contain the number of key-value pairs in the `ages` `TreeMap`.

## Other TreeMap Operations

`TreeMap` provides various methods and operations to work with the collection, such as:

- Checking if a key exists: You can use the `containsKey()` method to

 check if a specific key exists in the `TreeMap`.
 
- Checking if a value exists: You can use the `containsValue()` method to check if a specific value exists in the `TreeMap`.
- Iterating over key-value pairs: You can use enhanced `for-each` loops or iterator methods like `keySet()`, `values()`, and `entrySet()` to iterate over the key-value pairs in a `TreeMap`.
- Clearing the TreeMap: You can use the `clear()` method to remove all key-value pairs from the `TreeMap`.

`TreeMap` provides a sorted way to store and retrieve key-value pairs, making it useful in scenarios where you need to maintain a specific order or perform range-based operations on the keys. It is part of the Java Collections Framework and provides a powerful tool for managing and manipulating sorted data.
