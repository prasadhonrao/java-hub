# Collections Quiz 1

What is the output of the following code?

```java
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Collections Quiz 1!");

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {6, 7};

        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);

        numbers2 = numbers1;
        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);
    }
}
```

1. numbers1: [1, 2, 3, 4, 5]
   numbers2: [6, 7]
   numbers1: [1, 2, 3, 4, 5]
   numbers2: [1, 2, 3, 4, 5]

2. numbers1: [1, 2, 3, 4, 5]
   numbers2: [6, 7]
   numbers1: [1, 2, 3, 4, 5]
   numbers2: [6, 7]

3. numbers1: [1, 2, 3, 4, 5]
   numbers2: [6, 7]
   numbers1: [6, 7]
   numbers2: [6, 7]

4. numbers1: [6, 7]
   numbers2: [1, 2, 3, 4, 5]
   numbers1: [6, 7]
   numbers2: [6, 7]

Choose the correct option (1, 2, 3, or 4) and provide your answer.