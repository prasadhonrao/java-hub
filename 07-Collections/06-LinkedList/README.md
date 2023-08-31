# Java LinkedList

In Java, `LinkedList` is an implementation of the `List` interface that provides a doubly-linked list data structure. It allows for efficient insertion, deletion, and modification of elements at both the beginning and end of the list. `LinkedList` also implements the `Queue` and `Deque` interfaces, enabling it to be used as a queue or deque (double-ended queue). 

## Importing the LinkedList Class

Before using `LinkedList`, you need to import the `java.util` package, which contains the `LinkedList` class. You can import it at the beginning of your Java file with the following line of code:

```java
import java.util.LinkedList;
```

## Creating a LinkedList

To create a `LinkedList`, you can use the following syntax:

```java
LinkedList<elementType> linkedListName = new LinkedList<>();
```

Here, `elementType` represents the type of elements you want to store in the `LinkedList`, and `linkedListName` is the name you choose for your `LinkedList` variable. For example, to create a `LinkedList` to store strings, you would use the following code:

```java
LinkedList<String> names = new LinkedList<>();
```

## Adding Elements to a LinkedList

To add elements to a `LinkedList`, you can use the `add()` method. The `add()` method adds the specified element to the end of the `LinkedList`. Here's an example:

```java
names.add("Alice");
names.add("Bob");
names.add("Charlie");
```

In this example, three strings ("Alice", "Bob", and "Charlie") are added to the `names` `LinkedList`.

You can also add elements at specific positions in the list using the `add(index, element)` method. For example:

```java
names.add(1, "Dave");
```

In this example, the string "Dave" is inserted at index 1 in the `names` `LinkedList`, shifting the existing elements accordingly.

## Removing Elements from a LinkedList

To remove elements from a `LinkedList`, you can use the `remove()` method. The `remove()` method removes the first occurrence of the specified element from the list, if it exists. Here's an example:

```java
names.remove("Bob");
```

In this example, the string "Bob" is removed from the `names` `LinkedList`.

You can also remove elements at specific positions in the list using the `remove(index)` method. For example:

```java
names.remove(0);
```

In this example, the element at index 0 is removed from the `names` `LinkedList`.

## Accessing Elements in a LinkedList

You can access elements in a `LinkedList` using their indexes. The `get(index)` method returns the element at the specified index. Here's an example:

```java
String firstElement = names.get(0);
```

In this example, the element at index 0 is retrieved from the `names` `LinkedList` and stored in the `firstElement` variable.

## LinkedList Size

The size of a `LinkedList` represents the number of elements it currently holds. You can retrieve the size using the `size()` method. Here's an example:

```java
int size = names.size();
```

In this example, the variable `size` will contain the number of elements in the `names` `LinkedList`.

## Other LinkedList Operations

`LinkedList` provides various methods and operations to work with the collection, such as:

- Checking if an element exists: You can use the `contains()` method to check if a specific element exists in the `LinkedList`.
- Iterating over elements: You can use enhanced `for-each` loops or iterator methods like `iterator()` and `forEach()` to iterate over

 the elements in a `LinkedList`.
- Adding elements at the beginning or end: `LinkedList` provides methods like `addFirst(element)` and `addLast(element)` to add elements at the beginning or end of the list, respectively.
- Removing elements from the beginning or end: `LinkedList` provides methods like `removeFirst()` and `removeLast()` to remove elements from the beginning or end of the list, respectively.
- Clearing the LinkedList: You can use the `clear()` method to remove all elements from the `LinkedList`.

`LinkedList` is useful when you need a data structure that supports efficient insertion and deletion at both ends. It provides flexibility in managing and manipulating dynamic collections of elements.