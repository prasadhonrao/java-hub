public class App extends DerivedA {
    public static void main(String[] args) throws Exception {
        System.out.println("42!");

        Base b1 = new App();
        Base b2 = new DerivedA();
        Base b3 = new App();

        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }

    public void test() {
        System.out.println("App");
    }
}


class Base {
    public void test() {
        System.out.println("Base");
    }
}

class DerivedA extends Base {
    public void test() {
        System.out.println("DerivedA");
    }
}

