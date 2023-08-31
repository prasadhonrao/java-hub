public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("74!");

        int num1[] = {1, 2, 3};
        int num2[] = {1, 2, 3, 4, 5};

        num2 = num1;
        
        for (int i : num2) {
            System.out.println(i);
        }
    }
}
