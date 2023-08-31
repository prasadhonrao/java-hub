# Welcome to Java Programming Course

## Lesson 1: Getting Started with Java

### Program: Hello, World!

```java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Introduction

Welcome to the first lesson of our Java Programming Course! In this lesson, we will begin by getting familiar with the basic structure of a Java program and writing our first program: "Hello, World!".

## Java Program Structure

A Java program is composed of classes, and each program must have at least one class with a special method called `main`. The `main` method is the entry point of the program, where the execution starts. It has the following signature:

```java
public static void main(String[] args) {
    // Code to be executed
}
```

In our "Hello, World!" program, we have a class named `App` with the `main` method.

## Understanding the Code

Let's examine the code of our "Hello, World!" program:

```java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- The line `public class App` declares a class named `App`.
- The line `public static void main(String[] args)` defines the `main` method, which is the entry point of the program.
- Inside the `main` method, we have a single line of code: `System.out.println("Hello, World!");`.
- The `System.out.println()` statement is used to print the text "Hello, World!" to the console.

## Running the Program

To run the "Hello, World!" program, follow these steps:

1. Open a text editor and copy the code into a new file.
2. Save the file with a `.java` extension, for example, `App.java`.
3. Open a command prompt or terminal and navigate to the directory where the file is saved.
4. Compile the Java source file using the command `javac App.java`. This will generate a bytecode file named `App.class`.
5. Run the compiled program using the command `java App`. You should see the output `Hello, World!` displayed in the console.

Congratulations! You have successfully run your first Java program.

## Conclusion

In this lesson, we covered the basic structure of a Java program and wrote a simple "Hello, World!" program. You have taken the first step towards becoming a Java programmer. In the upcoming lessons, we will dive deeper into Java syntax, concepts, and programming techniques. Stay tuned!
