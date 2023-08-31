import java.util.function.BiFunction;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Functional Interface - BiFunction!");

        // BiFunction<T, U, R> - Represents a function that accepts two arguments and produces a result. The function is defined with two generic parameters T and U, and the return type is R. The BiFunction interface contains the following abstract method: R apply(T t, U u);

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));

        // andThen example. Note addThen takes a Function as an argument.
        Function<Integer, Integer> multiplyBy2 = a -> a * 2;
        System.out.println(add.andThen(multiplyBy2)
                              .apply(10, 20));

    }
}
