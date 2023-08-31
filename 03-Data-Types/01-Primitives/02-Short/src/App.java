public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Java Short Data Type!");

        // Short data type is a 16-bit signed two's complement integer
        // It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
    
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // Short assignment
        short myNewShortValue = (short) (myMaxShortValue / 2);
        System.out.println("Short Value = " + myNewShortValue);

        // Getting byte size
        System.out.println(myMaxShortValue + " byte size = " + Byte.SIZE);

    }
}
