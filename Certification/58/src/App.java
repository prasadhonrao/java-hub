public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("58!");

        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
