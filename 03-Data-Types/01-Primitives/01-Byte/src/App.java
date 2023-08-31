public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Java Byte Data Type!");

        // Byte data type is an 8-bit signed two's complement integer
        // It has a minimum value of -128 and a maximum value of 127 (inclusive)

        // Getting size of byte variable in bits
        System.out.println("Byte Size in bits = " + Byte.SIZE);

        // Getting size of byte variable in bytes
        System.out.println("Byte Size in bytes = " + Byte.BYTES);

        // Getting min and max range of byte variable
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // Byte assignment
        byte myNewByteValue = (byte) (myMaxByteValue / 2);
        System.out.println("Byte Value = " + myNewByteValue);

        // Wrapper
        byte byteValue = 10;
        Byte myByteWrapper = Byte.valueOf(byteValue); // boxing
        System.out.println("Boxed Value = " + myByteWrapper);

        byte byteValue2 = myByteWrapper.byteValue(); // unboxing
        System.out.println("Unboxed Value = " + byteValue2);
    }
}
