public class App {
    static int i;
    int j;
    public static void main(String[] args) throws Exception {
        System.out.println("28!");
        App x1 = new App();
        App x2 = new App();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;

        System.out.println(
            x1.i + " " 
            + x1.j + " " +
            x2.i + " " + 
            x2.j 
        );
        
    }
}
