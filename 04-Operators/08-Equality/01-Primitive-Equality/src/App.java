public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Equality!");

        // Primitive Equality
        int i = 10;
        int j = 10;
        double k = 10.0;
        double l = 10.0;

        // Primitive Equality of same type
        System.out.println("Primitive Equality of int type");
        System.out.println("i == j: " + (i == j));

        // Primitive Equality of same type
        System.out.println("Primitive Equality of double type");
        System.out.println("k == l: " + (k == l));

        // Primitive Equality of different type
        System.out.println("Primitive Equality of different type");
        System.out.println("i == k: " + (i == k));
    }
}
