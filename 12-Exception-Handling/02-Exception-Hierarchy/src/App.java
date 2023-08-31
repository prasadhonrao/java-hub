import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exception Hierarchy!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            int i = scanner.nextInt();
            System.out.println("You have entered: " + i);
        } catch (NumberFormatException ne) {
            System.out.println("NumberFormatException");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        scanner.close();
    }
}
