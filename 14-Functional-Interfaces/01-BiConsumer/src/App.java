import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Functional Interface - BiConsumer!");

        // BiConsumer is a functional interface that takes two arguments and returns no result. It can be useful when you want to perform some action on two arguments and return no result. For e.g. you can use BiConsumer to print two arguments.

        // BiConsumer
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Hello", "World");

        // BiConsumer with andThen
        BiConsumer<String, String> biConsumer2 = (a, b) -> System.out.println(a + " " + b);
        BiConsumer<String, String> biConsumer3 = (a, b) -> System.out.println(a + " " + b);
        biConsumer2.andThen(biConsumer3).accept("Hello", "World");

        // BiConsumer with HashMap
        Map<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        map.forEach((k, v) -> System.out.println(k + ": " + v)); // forEach accepts BiConsumer as an argument


    }
}
