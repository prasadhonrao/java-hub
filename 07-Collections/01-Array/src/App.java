public class App {
    public static void main(String[] args) {
        System.out.println("Array!");

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        
        System.out.println(numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        int[] numbers2 = { 1, 2, 3, 4, 5 };
        System.out.println(numbers2[0]);
        
    }
}
