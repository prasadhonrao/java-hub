import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("OOP Principles - Inheritance!");

        // Abstraction is the process of hiding the implementation details from the
        // user, only the functionality will be provided to the user. In other words,
        // the user will have the information on what the object does instead of how it
        // does it.
        // Encapsulation is the process of wrapping code and data together into a single
        // unit, for example, a class. In encapsulation, the variables of a class will
        // be hidden from other classes, and can be accessed only through the methods of
        // their current class. Therefore, it is also known as data hiding.
        // Inheritance is the process of using details from a new class without
        // modifying existing class. The newly formed class is known as derived (or
        // child) class and the one whose details are inherited is known as the base (or
        // parent) class.
        // Polymorphism is the process of using a common interface for multiple forms
        // (data types). For example, we can use the same method for different data
        // types.

        // Inheritance
        Customer john = new Customer(1, "John", LocalDate.of(1980, 8, 23), "New York");
        System.out.println(john);

        Customer alex = new PriorityCustomer(1, "Alex", LocalDate.of(1979, 8, 1), "New York", PriorityType.GOLD);
        System.out.println(alex);
        System.out.println("Alex's age: " + alex.getAge());

    }
}
