# Java `while` Loop

In Java, the `while` loop is a control flow statement that allows you to repeatedly execute a block of code as long as a specified condition is true. The general syntax of the `while` loop is as follows:

```java
while (condition) {
    // code to be executed while the condition is true
}
```

Here's how the `while` loop works:

1. The `condition` is evaluated before each iteration of the loop.
2. If the `condition` is `true`, the code block enclosed within the curly braces `{}` is executed.
3. After executing the code block, the `condition` is evaluated again.
4. If the `condition` is still `true`, the code block is executed again. This process continues until the `condition` becomes `false`.
5. If the `condition` is initially `false`, the code block is skipped, and the program continues to the statement following the `while` loop.

Here's an example that demonstrates the usage of the `while` loop:

```java
int count = 0;

while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
```

In the example above, the `while` loop executes as long as the value of `count` is less than 5. The code block within the loop prints the value of `count` and increments it by 1 in each iteration. The resulting output is:

```
Count: 0
Count: 1
Count: 2
Count: 3
Count: 4
```

It's important to ensure that the condition in the `while` loop eventually becomes `false` to avoid an infinite loop. If the condition never becomes `false`, the loop will continue indefinitely, causing the program to hang.

You can use the `while` loop to iterate over a collection, read input until a specific condition is met, or perform any repetitive task where the exact number of iterations is not known in advance.

Additionally, you can combine the `while` loop with control flow statements such as `break` and `continue` to customize the loop's behavior. The `break` statement allows you to exit the loop prematurely, while the `continue` statement allows you to skip the remaining code in the loop and move to the next iteration.

```java
int count = 0;

while (count < 10) {
    count++;

    if (count == 5) {
        break; // exit the loop when count is 5
    }

    if (count % 2 == 0) {
        continue; // skip even numbers
    }

    System.out.println("Count: " + count);
}
```

In this example, the loop stops when `count` is equal to 5 due to the `break` statement. Additionally, the `continue` statement is used to skip even numbers, so only the odd numbers are printed. The resulting output is:

```
Count: 1
Count: 3
```

The `while` loop provides a flexible way to repeat code execution based on a condition. It allows you to control the flow of your program and handle various looping scenarios efficiently.
