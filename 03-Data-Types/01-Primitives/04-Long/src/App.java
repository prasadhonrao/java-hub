public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Long Data Type!");

        // Long data type is a 64-bit signed two's complement integer
        // It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive)

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);

        // Long assignment
        long myNewLongValue = (myMaxLongValue / 2);
        System.out.println("Long Value = " + myNewLongValue);

        // Long assignment using suffix
        long myNewLongValue2 = 1_234_567_890L;
        System.out.println("Long Value = " + myNewLongValue2);

    }
}
