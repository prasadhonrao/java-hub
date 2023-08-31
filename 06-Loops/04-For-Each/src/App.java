public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("For Each Loop!");
        String[] fruits = { "Apple", "Orange", "Banana" };
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // For Each Loop with break statement
        System.out.println("For Each Loop With break!");
        for (String fruit : fruits) {
            System.out.println(fruit);
            if (fruit == "Banana") {
                break;
            }
        }

        // For Each Loop with continue statement
        System.out.println("For Each Loop With continue!");
        for (String fruit : fruits) {
            if (fruit == "Banana") {
                continue;
            }
            System.out.println(fruit);
        }
    }
}
