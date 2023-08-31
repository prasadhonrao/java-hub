public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Boxing And Unboxing!");
        
        // Boxing
        int x = 1;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        // Unboxing
        Integer z = Integer.valueOf(1);
        int a = z.intValue();
        System.out.println(a);
        
    }
}
