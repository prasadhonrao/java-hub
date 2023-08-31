public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exception Handling Quiz 1!");

        try {
            throw new Exception("Exception is thrown!");
        } catch (RuntimeException rex) {
            System.out.println("RuntimeException");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
