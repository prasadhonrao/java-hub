import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("ArrayList!");

        // Non-generic ArrayList
        ArrayList list1 = new ArrayList();
        list1.add("Hello");
        list1.add("World");
        list1.add("!");
        list1.add(1);
        System.out.println(list1.size());

        // Generic ArrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        ArrayList<Integer> numbers = new ArrayList<Integer>(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for (int i : numbers) {
            System.out.println(i);
        }
        
        // Create ArrayList from Array
        String[] names = { "John", "Jane", "Jill", "Joe" };
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList(names));
        namesList.forEach(n -> System.out.println(n));

    }
}
