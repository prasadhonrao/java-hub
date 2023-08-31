public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("95!");

        A b1 = new A();
        A b2 = new C();
        
        b1 = (A) b2;
        A b3 = (B) b2;
        
        b1.test();
        b3.test();

    }
}


class A { 
    public void test() {
        System.out.println("A");
    }
}

class B extends A {
    public void test() {
        System.out.println("B");
    }
}

class C extends A {
    public void test() {
        System.out.println("C");
    }
}