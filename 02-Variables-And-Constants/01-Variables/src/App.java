public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Variables!");

        // Explicitly declare the type of the variable
        int x = 1;
        System.out.println(x);

        // Reassign the variable
        x = 2;
        System.out.println(x);

        // Reassign to an invalid value
        // x = "Hello";
        // System.out.println(x);

        // Finding the variable type
        var y = 1;
        System.out.println(y);
        System.out.println(((Object) y).getClass().getSimpleName()); // Integer
    }
}
