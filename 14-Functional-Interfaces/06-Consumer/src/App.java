import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Functional Interface - Consumer!");

        // Consumer
        // Represents an operation that accepts a single input argument and returns no result.

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Using Concrete Class
        System.out.println("Using Concrete Class");
        class ConsumerImpl implements Consumer<Integer> {
            @Override
            public void accept(Integer t) {
                System.out.println(" - " + t);
            }
        }
        var consumer1 = new ConsumerImpl();
        list.forEach(consumer1);

        // Using Anonymous Class
        System.out.println("Using Anonymous Class");
        Consumer<Integer> consumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(" - " + t);
            }
        };
        
        list.forEach(consumer2);
        
        // Using Lambda Expression
        System.out.println("Using Lambda Expression");
        Consumer<Integer> consumer3 = (Integer t) -> {
            System.out.println(" - " + t);
        };

        list.forEach(consumer3);

        // Using Lambda Expression - Shorter
        System.out.println("Using Lambda Expression - Shorter");
        Consumer<Integer> consumer4 = (t) -> System.out.println(" - " + t);
        list.forEach(consumer4);

        // Using Lambda Expression - Shortest
        System.out.println("Using Lambda Expression - Shortest");
        Consumer<Integer> consumer5 = t -> System.out.println(" - " + t);
        list.forEach(consumer5);

        // Using Lambda Expression - Shortest
        System.out.println("Using Lambda Expression - Shortest");
        list.forEach(t -> System.out.println(" - " + t));

    }
}
