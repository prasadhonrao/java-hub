public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("17!");

        String opt = "true";
        switch (opt) {
            case "true":
                System.out.print("True");
                break;
            default:
                System.out.print("***");
        }
        System.out.println("Done");
    }
}
