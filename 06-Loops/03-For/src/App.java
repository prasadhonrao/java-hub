public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("For Loop!");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // For Loop with break statement
        System.out.println("For Loop With break!");
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
            if (j == 3) {
                break;
            }
        }

        // For Loop with continue statement
        System.out.println("For Loop With continue!");
        for (int k = 0; k < 5; k++) {
            if (k == 3) {
                continue;
            }
            System.out.println(k);
        }

        // For Loop with labels
        System.out.println("For Loop With labels!");
        OUTER: for (int l = 0; l < 3; l++) {
            INNER: for (int m = 0; m < 5; m++) {
                if (m == 2) {
                    break INNER;
                }
                System.out.println(l + " - " + m);
            }
        }
    }
}
