import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("If Conditional Statement!");

        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are not an adult!");
        }

        scanner.close();
    }
}
