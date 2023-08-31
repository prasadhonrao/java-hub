public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Interface - Intro!");

        Person c = new Customer(1, "Customer 1");
        Person e = new Employee(1, "Employee 1");

        c.displayInfo();
        e.displayInfo();
    }
}
