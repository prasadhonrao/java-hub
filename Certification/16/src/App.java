public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("16!");

        int x = 5;
        while (isAvailable(x)) {
            System.out.print(x);
            x--;
        }
    }

    public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }
}
