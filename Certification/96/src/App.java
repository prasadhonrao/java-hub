public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("96!");

        doSum(10, 20);
        doSum(10.0, 20.0);
    }

    public static void doSum(Integer x, Integer y){
        System.out.println("Integer Sum is: " + (x+y));
    }

    public static void doSum(double x, double y){
        System.out.println("Double Sum is: " + (x+y));
    }

    public static void doSum(float x, float y){
        System.out.println("Float Sum is: " + (x+y));
    }

    public static void doSum(int x, int y){
        System.out.println("Int Sum is: " + (x+y));
    }
}
