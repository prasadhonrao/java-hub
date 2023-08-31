public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("While Loop Quiz!");

        int x = 1;
        int y = 10;

        while (x > 0 && y <= 10) {
            x--;
            y++;
        }

        System.out.println(x + " - " + y);
    }
}
