public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1!");
        
        Product p = new Product();
        p.price = 200;
        double newPrice = 100;

        App app = new App();
        app.updatePrice(p, newPrice);
        System.out.println(p.price + " : " + newPrice);
    }

    private void updatePrice(Product p, double newPrice) {
        newPrice = newPrice * 2;
        p.price = p.price + newPrice;
    }
}

class Product {
    double price;
}
