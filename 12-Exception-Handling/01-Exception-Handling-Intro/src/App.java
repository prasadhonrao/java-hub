public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exception Handling - Intro!");

        int a = 10;
        int b = 0;
        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Error: " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Terminating program...");
        }

    }
}
