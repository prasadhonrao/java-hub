# Collections Quiz 2

What is the output of the following code?

```java
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Collections Quiz 2");

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[][] numbers2 = {{6, 7},{8, 9}};

        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);

        numbers2 = numbers1;
        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);
    }
}
```

1. numbers1: [1, 2, 3, 4, 5]
   numbers2: [[6, 7], [8, 9]]
   numbers1: [1, 2, 3, 4, 5]
   numbers2: [1, 2, 3, 4, 5]

2. numbers1: [1, 2, 3, 4, 5]
   numbers2: [[6, 7], [8, 9]]
   numbers1: [1, 2, 3, 4, 5]
   numbers2: [[6, 7], [8, 9]]

3. numbers1: [1, 2, 3, 4, 5]
   numbers2: [[6, 7], [8, 9]]
   numbers1: [1, 2, 3, 4, 5]
   numbers2: [1, 2, 3, 4, 5]

4. Compilation error

5. None of the above

Choose the correct option (1, 2, 3, 4, or 5) and provide your answer.