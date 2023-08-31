public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("While Loop!");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // While Loop with break statement
        System.out.println("While Loop With break!");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            if (j == 3) {
                break;
            }
            j++;
        }

        // While Loop with continue statement
        System.out.println("While Loop With continue!");
        int k = 0;
        while (k < 5) {
            if (k == 3) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }
    }
}
