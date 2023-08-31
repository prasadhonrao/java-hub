public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("85!");

        boolean a = new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(args[1]);
        System.out.println(a + " " + b);
    }
}
