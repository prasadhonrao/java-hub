public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Do While Loop!");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        // Do While Loop with break statement
        System.out.println("Do While Loop With break!");
        int j = 0;
        do {
            System.out.println(j);
            if (j == 3) {
                break;
            }
            j++;
        } while (j < 5);

        // Do While Loop with continue statement
        System.out.println("Do While Loop With continue!");
        int k = 0;
        do {
            if (k == 3) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        } while (k < 5);
    }
}
