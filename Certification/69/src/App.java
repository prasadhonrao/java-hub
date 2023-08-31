public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("69!");

        // byte x = 1;
        // short x = 1;
        // String x = "1";
        // long x = 1;
        // double x = 1;
        Integer x = new Integer("1");

        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
        }
    }
}
