public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 8!");

        Book book1 = new EBook();
        book1.readBook();

    }
}

interface Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable { // line n1
    public void readBook() {
    }
    // line n2
}

class EBook extends Book { // line n3
    public void readBook() {
    }

    public void setBookMark() {}
    // line n4
}

