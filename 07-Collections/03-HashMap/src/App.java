import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("HashMap");

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        System.out.println(people);
    }
}
