public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operator Precedence Quiz!");

        int x = 5;
        boolean y = (2 < 1) || (x-- == 4);

        System.out.println(x);
        System.out.println(y);
    }
}
