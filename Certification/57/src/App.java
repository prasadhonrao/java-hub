public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("57!");

        int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;

        for (int i : intArr) {
            System.out.print(i);
        }
    }
}
