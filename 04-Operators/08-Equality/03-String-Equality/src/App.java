public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Reference Equality!");

        

        // String Equality
        System.out.println("String Equality");
        String first = "Hello";
        String second = "Hello";
        System.out.println("first == second: " + (first == second));
        System.out.println("first equals second: " + (first.equals(second))); // does character by character comparison
        System.out.println("first compare second: " + (first.compareTo(second)));

    }
}
