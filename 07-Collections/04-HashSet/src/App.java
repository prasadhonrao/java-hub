import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        System.out.println("HashSet");

        // Create a HashSet
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Steve");
        hashSet.add("Angie");

        System.out.println(hashSet);

        // Add the same element again
        boolean result = hashSet.add("John");
        System.out.println(hashSet);
        System.out.println(result);

        // HashSet
        HashSet<String> myHashSet = new HashSet<String>();
        myHashSet.add("value1");
        myHashSet.add("value2");

        // Get an item from the collection
        System.out.println("Value = " + myHashSet.contains("value1"));

        // Iterate through the collection
        for (String value : myHashSet) {
            System.out.println("Value = " + value);
        }

        // Remove an item from the collection
        myHashSet.remove("value1");

        // Get the size of the collection
        System.out.println("HashSet Size = " + myHashSet.size());

    }
}
