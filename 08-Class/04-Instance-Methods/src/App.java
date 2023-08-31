import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("OOP - Class Methods!");
     
        Customer customer = new Customer(1, "John", LocalDate.of(1980, 8, 23), "New York");
      
        System.out.println("Customer age: " + customer.getAge());
    }
}
