public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Package!");

        Northwind.Customer customer1 = new Northwind.Customer(1, "John");
        System.out.println(customer1);

        Northwind.Customer customer2 = new Northwind.Customer(-1, "Mary");
        System.out.println(customer2);

        AdventureWorks.Customer customer3 = new AdventureWorks.Customer(2, "Mary");
        System.out.println(customer3);
    }
}
