public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operator Precedence Quiz!");

        int a = 10.0;
        int b = (4 % 3) + 3;
        int c = ++a + b;

        System.out.println(c);
    }
}
