import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Functional Interface - Predicate!");

        // Simple Predicate
        Predicate<Integer> predicate = (value) -> value > 10;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(11));

        // Passing Predicate to a method
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(totalValues(numbers, e -> true));
        System.out.println(totalValues(numbers, e -> e % 2 == 0));
        System.out.println(totalValues(numbers, e -> e % 2 != 0));

    }

    private static int totalValues(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.stream()
                      .filter(predicate)
                      .reduce(0, (c, e) -> c + e);
    }

}
