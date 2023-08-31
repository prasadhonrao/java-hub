public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Non Primitive Data Type Record!");

        Customer john = new Customer("John Doe", "123 Main St", "555-555-5555", "john.doe@gmail.com");
        System.out.println(john);
        System.out.println(john.name());

        Customer john2 = new Customer("John Doe", "123 Main St", "555-555-5555", "john.doe@gmail.com");
        System.out.println(john2);

        // Compare the two records
        System.out.println(john.equals(john2));

        // Get the hashCode of the record
        System.out.println(john.hashCode());
        System.out.println(john2.hashCode());
    }
}

