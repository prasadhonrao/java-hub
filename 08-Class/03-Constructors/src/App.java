import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Class - Constructors!");

        Customer john = new Customer(1, "John", LocalDate.of(1980, 8, 23), "New York");
        System.out.println(john);

        Customer alex = new PriorityCustomer(1, "Alex", LocalDate.of(1979, 8, 1), "New York", PriorityType.GOLD);
        System.out.println(alex);

        Customer sam = new PriorityCustomer();
        System.out.println(sam);
       
    }
}
