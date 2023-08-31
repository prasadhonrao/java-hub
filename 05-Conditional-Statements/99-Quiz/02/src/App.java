public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ternary Expression Quiz!");

        int a = 3;
        int b = --a == 2 ? a++ : a--;
        
        System.out.println(a);
        System.out.println(b);
    }
}
