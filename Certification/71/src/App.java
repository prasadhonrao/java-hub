public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("71!");
        try {
            method1();
        } catch (MyException e) {
            System.out.println("A");
        }
    }

    private static void method1() {
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException re) {
            System.out.println("B");
        }
    }
}

class MyException extends RuntimeException {
}