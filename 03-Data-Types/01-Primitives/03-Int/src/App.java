public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Int Data Type!");

        // Int data type is a 32-bit signed two's complement integer
        // It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive)

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Int Minimum Value = " + myMinIntValue);
        System.out.println("Int Maximum Value = " + myMaxIntValue);

        // Int assignment
        int myNewIntValue = (myMaxIntValue / 2);
        System.out.println("Int Value = " + myNewIntValue);

    }
}
