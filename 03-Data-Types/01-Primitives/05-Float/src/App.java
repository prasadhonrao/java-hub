public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Float Data Type!");

        // Float data type is a single-precision 32-bit IEEE 754 floating point
        // It has a minimum value of 1.4e-45 and a maximum value of 3.4028235e+38 (inclusive)

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value = " + myMinFloatValue);

        // Float assignment
        float myNewFloatValue = (myMaxFloatValue / 2);
        System.out.println("Float Value = " + myNewFloatValue);

        // Float assignment using suffix
        float myNewFloatValue2 = 1.2F;
        System.out.println("Float Value = " + myNewFloatValue2);

        // By default Java compiler treats float values as doubles.
        var myFloat = 5.25;
        var type = ((Object) myFloat).getClass().getSimpleName();
        System.out.println(type);

        var myFloat2 = 5.25F;
        type = ((Object) myFloat2).getClass().getSimpleName();
        System.out.println(type);
        
    }
}
