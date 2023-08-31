import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("User Defined Class!");

        // User defined class is a data type that is defined by the user
        // It is a template for creating objects

        Customer customer = new Customer(1, "John");
        System.out.println(customer);

        // Collection of user defined class
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customers.add(new Customer(2, "Mary"));
        customers.add(new Customer(3, "Jane"));

        customers.forEach(c -> System.out.println(c));
    }
}
