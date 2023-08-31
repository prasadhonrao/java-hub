public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("30!");

        String[] arr = { "A", "B", "C", "D" };

        for( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");

            if (arr[i].equals("C")) {
                continue;
            }

            System.out.println("Work done");
            break;
        }
    }
}
