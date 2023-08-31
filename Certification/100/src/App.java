public class App {
    int count;

    public static void displayMsg() {
        count++;
        System.out.println("Welcome " + "Visit Count: " + count);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("100!");
        App.displayMsg();
        App.displayMsg();

    }
}
