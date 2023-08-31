import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Path to Lambda!");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // External Iterator
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }
        System.out.println();

        // Internal Iterator
        for (int e : numbers) {
            System.out.print(e);
        }
        System.out.println();

        // Anonymous Inner Class : This creates a App$1.class file for each anonymous class which is an overkill and not required. This limitation is handled by lambda expressions.
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.print(value);
            }
        });
        System.out.println();

        // Lambda Expression
        numbers.forEach((Integer value) -> System.out.print(value));
        System.out.println();

        // Lambda Expression
        numbers.forEach((value) -> System.out.print(value));
        System.out.println();

        // Method Reference
        numbers.forEach(System.out::print);
        System.out.println();

    }
}
