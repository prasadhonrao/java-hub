public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exception Handling Quiz 1!");

        try {
            System.exit(0);
        } finally {
            System.out.println("Finally");
        }
    }
}
