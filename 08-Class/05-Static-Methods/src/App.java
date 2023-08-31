import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Static Methods!");

        Customer customer = new Customer(1, "John", LocalDate.of(1990, 1, 1), "New York");
        Customer customer2 = new Customer(2, "Mary", LocalDate.of(1990, 1, 1), "New York");

        System.out.println(Customer.count);
    }
}
