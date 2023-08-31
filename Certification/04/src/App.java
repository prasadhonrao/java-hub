public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 4!");


    }
}

abstract class Planet {
    protected void revolve() { // line n1
    }

    abstract void rotate(); // line n2
}

class Earth extends Planet {
    void revolve() { // line n3
    }

    protected void rotate() { // line n4
    }
}