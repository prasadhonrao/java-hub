public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("86!");

        int[][] arr = new int[2][4];
        arr[0] = new int[] {1, 3, 5, 7};
        arr[1] = new int[] {1, 3};   
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
