public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("56");

        Planet[] planets = {
            new Planet("Mercury", 0),
            new Planet("Venus", 0),
            new Planet("Earth", 1),
            new Planet("Mars", 2),
            new Planet("Jupiter", 79),
            new Planet("Saturn", 82),
            new Planet("Uranus", 27),
            new Planet("Neptune", 14)
        };

        System.out.println(planets);
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);
    }
}
