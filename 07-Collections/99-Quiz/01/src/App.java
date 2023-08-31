public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Collections Quiz 1!");

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {6, 7};

        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);

        numbers2 = numbers1;
        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers2: " + numbers2);
    }
}
