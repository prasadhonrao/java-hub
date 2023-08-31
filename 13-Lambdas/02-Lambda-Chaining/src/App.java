import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lambda Chaining!");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Problem Statement: Square all the numbers and add them together and print the result

        // Imperative code using for loop
        int result = 0;
        for (int n : numbers) {
            result = result + n * n;
        }
        System.out.println(result);

        // Declarative code using lambdas
        System.out.println(numbers.stream()
                .map(x -> x * x)
                .reduce(0, (x, y) -> x + y));

    }
}
