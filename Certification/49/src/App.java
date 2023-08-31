public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("49!");

        int[] arr = { 1, 2, 3, 4};
        int i = 0;

        do {
            System.out.print(arr[i]);
            i++;
        } while (i < arr.length + 1);
    }
}
