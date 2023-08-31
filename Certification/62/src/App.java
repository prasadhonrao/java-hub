import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("62!");

        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(new Tiger());

        ArrayList<Hunter> myList2 = new ArrayList<>();
        myList2.add(new Cat());

        ArrayList<Hunter> myList3 = new ArrayList<>();
        myList3.add(new Tiger());

        // this does not compile
        // ArrayList<Tiger> myList4 = new ArrayList<>();
        // myList4.add(new Cat());

        ArrayList<Animal> myList5 = new ArrayList<>();
        myList5.add(new Cat());

    }
}

abstract class Animal {}
interface Hunter {}
class Cat extends Animal implements Hunter {}
class Tiger extends Cat {}
