# Java `for` Loop

In Java, the `for` loop is a control flow statement that allows you to repeatedly execute a block of code a fixed number of times. The `for` loop provides a compact syntax for initializing a variable, specifying a termination condition, and defining how the variable is updated in each iteration. The general syntax of the `for` loop is as follows:

```java
for (initialization; condition; update) {
    // code to be executed in each iteration
}
```

Here's how the `for` loop works:

1. The `initialization` step is executed first and is typically used to initialize a loop control variable.
2. The `condition` is evaluated before each iteration. If the condition is `true`, the loop continues to execute. If the condition is `false`, the loop is terminated, and the program continues to the statement following the `for` loop.
3. After each iteration, the `update` step is executed to update the loop control variable.
4. The code block enclosed within the curly braces `{}` is executed in each iteration.

Here's an example that demonstrates the usage of the `for` loop:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Count: " + i);
}
```

In the example above, the `for` loop initializes the loop control variable `i` to 0, executes the code block to print the value of `i`, and increments `i` by 1 in each iteration. The loop continues as long as the value of `i` is less than 5. The resulting output is:

```
Count: 0
Count: 1
Count: 2
Count: 3
Count: 4
```

The `for` loop provides a concise way to iterate over a range of values or collections. It is commonly used when the exact number of iterations is known in advance, making it easier to manage and control the loop execution.

You can also use the `for-each` loop, a variant of the `for` loop, to iterate over elements of an array or collections. Here's an example that demonstrates the usage of the `for-each` loop:

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int number : numbers) {
    System.out.println("Number: " + number);
}
```

In this example, the `for-each` loop iterates over each element in the `numbers` array and prints its value. The resulting output is:

```
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
```

The `for` loop offers great flexibility by allowing you to control the initialization, condition, and update steps within a single line. It is a fundamental construct in Java that is widely used for repetitive tasks, such as iterating over arrays, processing collections, and performing calculations.
