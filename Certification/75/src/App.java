public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("75!");

        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen");
        Product p3 = p1;
        boolean ans1 = p1 == p2;
        boolean ans2 = p1.name.equals(p2.name);
        System.out.println(ans1 + " : " + ans2);
    }
}
