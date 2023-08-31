public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("37!");

        double discount = 0;
        int qty = Integer.parseInt(args[0]);

        // if (qty >= 90) {
        //     discount = 0.5;
        // }
        // if (qty > 80 && qty < 90) {
        //     discount = 0.2;
        // }

        discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;

        System.out.println("Discount: " + discount);
    }
}
