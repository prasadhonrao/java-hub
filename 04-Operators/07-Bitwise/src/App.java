public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bitwise Operator!");

        // Bitwise AND returns true if both the left and right operands are true
        System.out.println(1 & 2); // 0

        // Bitwise OR returns true if either the left or right operands are true
        System.out.println(1 | 2); // 3

        // Bitwise XOR returns true if either the left or right operands are true, but not both
        System.out.println(1 ^ 2); // 3

        // Bitwise NOT inverts the bits of the operand
        System.out.println(~1); // -2

        // Bitwise Left Shift shifts the bits of the operand to the left
        System.out.println(1 << 2); // 4

        // Bitwise Right Shift shifts the bits of the operand to the right
        System.out.println(1 >> 2); // 0

        // Bitwise Right Shift Zero Fill shifts the bits of the operand to the right, and fills the leftmost bits with zeros
        System.out.println(1 >>> 2); // 0

    }
}
