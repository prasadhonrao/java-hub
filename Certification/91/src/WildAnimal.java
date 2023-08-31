
public class WildAnimal extends Animal {
    String bounds;

    WildAnimal(String bounds) {
        this.bounds = bounds;
    }

    WildAnimal(String type, int maxSpeed, String bounds) {
        super(type, maxSpeed);
        this.bounds = bounds;
    }
}