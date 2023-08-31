public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("19");

        int x = 100; // 101
        int a = x++; // 100
        int b = ++x; // 102
        int c = x++; // 102

        int d = ( a < b) ? (a < c) ? a : ( b < c) ? b : c : x;
        System.out.println(d);
    }
}
