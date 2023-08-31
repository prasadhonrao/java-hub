public class App {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            System.out.println("Hello " + args[0] + "!");
        } else {
            System.out.println("No command line arguments!");
        }
    }
}
