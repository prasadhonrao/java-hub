public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wrapper Equality!");

        // Wrapper Equality
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(1);
        Double c = Double.valueOf(1.0);
        Double d = Double.valueOf(1.0);

        // Wrapper Equality of Integer type
        System.out.println("Wrapper Equality of Integer type");
        System.out.println("a == b: " + (a == b));
        System.out.println("a equals b: " + (a.equals(b)));
        System.out.println("a compare b: " + (a.compareTo(b)));

        // Wrapper Equality of Double type
        System.out.println("Wrapper Equality of Double type");
        System.out.println("c == d: " + (c == d));
        System.out.println("c equals d: " + (c.equals(d)));
        System.out.println("c compare d: " + (c.compareTo(d)));

        // Wrapper Equality of different type
        System.out.println("Wrapper Equality of different type");
        // System.out.println("a == c: " + (a == c));
        System.out.println("a equals c: " + (a.equals(c)));
        // System.out.println("a compare c: " + (a.compareTo(c)));

    }
}
