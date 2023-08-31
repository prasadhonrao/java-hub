public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Object Equality Operator Quiz!");

        Person person1 = new Person(1);
        Person person2 = new Person(1);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        Person person3 = person1;
        System.out.println(person1 == person3);

    }
}

