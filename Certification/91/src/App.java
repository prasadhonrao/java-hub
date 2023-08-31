public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("91!");

        WildAnimal wolf = new WildAnimal("Long");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);

        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
        
    }
}