public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Collections Quiz 3");
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.remove(2);

        System.out.println("Size of fruits: " + fruits.size());
        System.out.println("Is fruits empty? " + fruits.isEmpty());
        System.out.println("Index of 'Banana': " + fruits.indexOf("Banana"));
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));
        System.out.println("Fruits: " + fruits);
    }
}
