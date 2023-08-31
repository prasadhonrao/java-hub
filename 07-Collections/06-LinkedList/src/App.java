import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Java LinkedList Collection!");

        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Add an element at the beginning
        linkedList.addFirst("Mango");

        // Add an element at the end
        linkedList.addLast("Grapes");

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);

        // Remove an element from the LinkedList
        linkedList.remove("Banana");

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);

        // Access an element at a specific index
        String fruit = linkedList.get(2);
        System.out.println("Fruit at index 2: " + fruit);

        // Check if an element exists in the LinkedList
        boolean containsApple = linkedList.contains("Apple");
        System.out.println("Contains Apple? " + containsApple);

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);
    }
}

