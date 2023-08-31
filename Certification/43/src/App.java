import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("43!");

        ArrayList myList = new ArrayList();
        String [] myArray;

        try {
            while (true) {
                myList.add("My String");
            }
        } catch (RuntimeException re) {
            System.out.println("Caught a RuntimeException");
        }
        catch (Exception e) {
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}
