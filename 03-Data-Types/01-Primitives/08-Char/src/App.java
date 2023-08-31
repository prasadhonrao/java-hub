public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Char Data Type!");

        // Char data type is a single 16-bit Unicode character
        // It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive)

        char myMinCharValue = Character.MIN_VALUE;
        char myMaxCharValue = Character.MAX_VALUE;

        System.out.println("Char Minimum Value = " + myMinCharValue);
        System.out.println("Char Maximum Value = " + myMaxCharValue);

        // Char assignment
        char myNewCharValue = 'A';
        System.out.println("Char Value = " + myNewCharValue);

        // Unicode character assignment
        char myUnicodeCharValue = '\u00A9';
        System.out.println("Unicode Char Value = " + myUnicodeCharValue);

    }
}
