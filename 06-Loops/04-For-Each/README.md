# Java `for-each` Loop

In Java, the `for-each` loop, also known as the enhanced `for` loop, is a control flow statement that allows you to iterate over elements of an array or a collection in a simplified manner. The `for-each` loop automatically handles the iteration details, eliminating the need for explicit indexing or manual control variables. The general syntax of the `for-each` loop is as follows:

```java
for (elementType element : arrayOrCollection) {
    // code to be executed for each element
}
```

Here's how the `for-each` loop works:

1. The loop iterates over each element in the `arrayOrCollection` one by one.
2. In each iteration, the current element is assigned to the `element` variable of type `elementType`.
3. The code block within the loop is executed for each element.

Here's an example that demonstrates the usage of the `for-each` loop with an array:

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int number : numbers) {
    System.out.println("Number: " + number);
}
```

In the example above, the `for-each` loop iterates over each element in the `numbers` array. In each iteration, the current element is assigned to the `number` variable, and its value is printed. The resulting output is:

```
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
```

The `for-each` loop can also be used with collections such as `List`, `Set`, or `Map`. Here's an example that demonstrates the usage of the `for-each` loop with a `List`:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

for (String name : names) {
    System.out.println("Name: " + name);
}
```

In this example, the `for-each` loop iterates over each element in the `names` list. The current element is assigned to the `name` variable of type `String`, and its value is printed. The resulting output is:

```
Name: Alice
Name: Bob
Name: Charlie
```

The `for-each` loop provides a simplified and readable way to iterate over elements in an array or a collection without the need for explicit indexing or managing loop control variables. It is particularly useful when you need to perform an operation on each element of a container or when you want to iterate through a collection in a forward-only manner.

It's important to note that the `for-each` loop is read-only, meaning you cannot modify the elements of the array or collection within the loop. If you need to modify the elements, you should use the traditional `for` loop with an index.

Overall, the `for-each` loop enhances the code readability and reduces the chances of introducing errors by simplifying the iteration process over arrays and collections in Java.
