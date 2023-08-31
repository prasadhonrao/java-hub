# Java ArrayList Quiz

Consider the following code snippet:

```java
import java.util.ArrayList;

public class ArrayListQuiz {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.remove(2);

        System.out.println("Size of fruits: " + fruits.size());
        System.out.println("Is fruits empty? " + fruits.isEmpty());
        System.out.println("Index of 'Banana': " + fruits.indexOf("Banana"));
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));
        System.out.println("Fruits: " + fruits);
    }
}
```

## What is the output of the code?

- Size of fruits: 4
    Is fruits empty? false

    Index of 'Banana': 1

    Contains 'Mango'? true

    Fruits: [Apple, Banana, Mango, Orange]

- Size of fruits: 3
    Is fruits empty? false

    Index of 'Banana': 1

    Contains 'Mango'? true

    Fruits: [Apple, Banana, Mango, Orange]

- Size of fruits: 3
    Is fruits empty? true

    Index of 'Banana': 1

    Contains 'Mango'? true

    Fruits: [Apple, Banana, Mango]

- Size of fruits: 4
    Is fruits empty? true

    Index of 'Banana': 1

    Contains 'Mango'? true

    Fruits: [Apple, Banana, Mango]

## After executing the code, what will be the index of the element 'Orange' in the ArrayList?

- 0
- 1
- 2
- 3

## Which method is used to remove an element at a specific index from an ArrayList?

- `removeFirst()`
- `removeLast()`
- `removeElement()`
- `remove()`

## Which method is used to add an element at the end of an ArrayList?

- `addFirst()`
- `addLast()`
- `addElement()`
- `add()`

## What does the `size()` method return for an empty ArrayList?

- 0
- 1
- -1
- It throws an exception
