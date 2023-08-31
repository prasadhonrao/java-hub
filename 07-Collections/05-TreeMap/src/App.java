import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TreeMap");
        
        // Create a TreeMap
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("John", "32");
        treeMap.put("Steve", "30");
        treeMap.put("Angie", "33");

        // Print keys
        System.out.println("Keys: " + treeMap.keySet());

        // Print values
        System.out.println("Values: " + treeMap.values());

        // Add the same key again
        // treeMap.put("John", "35");
        // System.out.println(treeMap);


    }
}
