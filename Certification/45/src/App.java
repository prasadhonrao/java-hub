import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("45!");

        List<Person> iList = Arrays.asList( 
            new Person("Hank", 45), 
            new Person("Charlie", 40),
            new Person("Smith", 38)
        );

        checkAge(iList, p -> p.getAge() > 40);
    }

    public static void checkAge(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.name);
            }
        }
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

   
}
