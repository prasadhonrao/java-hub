public class App {

    static String name = "John Global";
    public static void main(String[] args) throws Exception {
        System.out.println("Variable Scope!");

        // Local variable
        String name = "John Local";

        // Anonymous block
        {
            // Local variable
            String localName = "John Local 1";
            System.out.println("Name: " + localName);
        }
        
        System.out.println("Name: " + name);

    }
}
