public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Java Double Data Type!");

        // Double data type is a double-precision 64-bit IEEE 754 floating point
        // It has a minimum value of 4.9e-324 and a maximum value of 1.7976931348623157e+308 (inclusive)

        // Getting size of double variable in bits
        System.out.println("Double Size in bits = " + Double.SIZE);

        // Getting size of double variable in bytes
        System.out.println("Double Size in bytes = " + Double.BYTES);

        // Getting min and max value of double variable
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        // Double assignment
        double myNewDoubleValue = (myMaxDoubleValue / 2);
        System.out.println("Double Value = " + myNewDoubleValue);

        // Double assignment using suffix
        double myNewDoubleValue2 = 1.2D;
        System.out.println("Double Value = " + myNewDoubleValue2);

    }
}
