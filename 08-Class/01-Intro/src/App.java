import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Class - Intro!");
     
        Customer customer = new Customer(1, "John", LocalDate.of(1980, 8, 23), "New York");
        System.out.println(customer);

        Product product = new Product(1, "Laptop", 999.95);
        System.out.println(product);
    }
}


