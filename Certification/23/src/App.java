public class App extends B {

    public App() {
        System.out.print("C");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("23!");
        App a = new App();
    }
}

class A {
    public A() {
        System.out.print("A");
    }
}

class B extends A {
    public B() {
        System.out.print("B");
    }
}
