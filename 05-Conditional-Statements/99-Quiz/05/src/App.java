import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Switch Case Quiz!");

        String s = "hi";
        final String hi = "hi";

        switch (s) {
            case "HI":
            case "hello":
                System.out.println("A");
                break;
            case hi:
                System.out.println("C");
                break;
            default:
                System.out.println("B");
                break;
        }
    }
}
