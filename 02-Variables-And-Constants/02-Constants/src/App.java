public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Constants!");

        // Explicitly declare the variable
        int x = 1;
        System.out.println(x);

        x = 10;
        System.out.println(x);

        // Variable declared as final is a constant
        final int y = 10;
        System.out.println(y);

        // y = 11;
        // System.out.println(y);
    }
}
