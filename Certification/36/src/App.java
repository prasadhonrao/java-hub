public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("36!");

        App app = new App();
        System.out.print(isAvailable + "");
        isAvailable = app.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}
