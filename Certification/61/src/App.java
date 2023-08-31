public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("61!");

        int var1 = 200;
        System.out.print(doCalc(var1));
        System.out.print(" " + var1);
    }

    static int doCalc(int var1) {
        var1 = var1 * 2;
        return var1;
    }
}
