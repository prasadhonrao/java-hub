# Java HashSet

In Java, `HashSet` is an implementation of the `Set` interface that provides an unordered collection of unique elements. It does not allow duplicate values and offers constant-time performance for basic operations like `add()`, `remove()`, and `contains()`. `HashSet` is commonly used when you need to store a collection of elements without any specific order and ensure uniqueness.

## Importing the HashSet Class

Before using `HashSet`, you need to import the `java.util` package, which contains the `HashSet` class. You can import it at the beginning of your Java file with the following line of code:

```java
import java.util.HashSet;
```

## Creating a HashSet

To create a `HashSet`, you can use the following syntax:

```java
HashSet<elementType> hashSetName = new HashSet<>();
```

Here, `elementType` represents the type of elements you want to store in the `HashSet`, and `hashSetName` is the name you choose for your `HashSet` variable. For example, to create a `HashSet` to store integers, you would use the following code:

```java
HashSet<Integer> numbers = new HashSet<>();
```

## Adding Elements to a HashSet

To add elements to a `HashSet`, you can use the `add()` method. The `add()` method adds the specified element to the `HashSet` if it is not already present. Here's an example:

```java
numbers.add(10);
numbers.add(20);
numbers.add(30);
```

In this example, three integers (10, 20, and 30) are added to the `numbers` `HashSet`.

## Removing Elements from a HashSet

To remove elements from a `HashSet`, you can use the `remove()` method. The `remove()` method removes the specified element from the `HashSet` if it exists. Here's an example:

```java
numbers.remove(20);
```

In this example, the integer 20 is removed from the `numbers` `HashSet`.

## Checking if an Element Exists in a HashSet

To check if an element exists in a `HashSet`, you can use the `contains()` method. The `contains()` method returns `true` if the specified element is present in the `HashSet`, and `false` otherwise. Here's an example:

```java
boolean containsTen = numbers.contains(10);
```

In this example, the `containsTen` variable will be `true` if the number 10 is present in the `numbers` `HashSet`, and `false` otherwise.

## HashSet Size

The size of a `HashSet` represents the number of elements it currently holds. You can retrieve the size using the `size()` method. Here's an example:

```java
int size = numbers.size();
```

In this example, the variable `size` will contain the number of elements in the `numbers` `HashSet`.

## Other HashSet Operations

`HashSet` provides various methods and operations to work with the collection, such as:

- Iterating over elements: You can use enhanced `for-each` loops or iterator methods like `iterator()` and `forEach()` to iterate over the elements of a `HashSet`.
- Clearing the HashSet: You can use the `clear()` method to remove all elements from the `HashSet`.
- Checking if the HashSet is empty: You can use the `isEmpty()` method to check if a `HashSet` contains no elements.

`HashSet` provides an efficient way to store and retrieve a collection of unique elements without any specific order. It is widely used in various applications and is part of the Java Collections Framework, providing a powerful tool for managing and manipulating sets of data.
