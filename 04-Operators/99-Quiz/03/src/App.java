public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Logical Operator Quiz!");

        boolean z = getValueOfX() < getValueOfY() || getValueOfX() <  getValueOfZ();
        System.out.println(z);
    }

    public static int getValueOfX() {
        System.out.println("Getting value of x");
        return 10;
    }

    public static int getValueOfY() {
        System.out.println("Getting value of y");
        return 20;
    }

    public static int getValueOfZ() {
        System.out.println("Getting value of z");
        return 30;
    }
}
