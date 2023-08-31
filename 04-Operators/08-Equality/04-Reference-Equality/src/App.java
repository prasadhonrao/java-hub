import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Reference Equality!");

        Customer john1 = new Customer(1, "John", LocalDate.of(1980, 8, 23), "New York");
        System.out.println(john1);

        Customer john2 = new Customer(1, "John", LocalDate.of(1980, 8, 23), "New York");
        System.out.println(john2);

        System.out.println("john1 == john2: " + (john1 == john2));
    }
}
