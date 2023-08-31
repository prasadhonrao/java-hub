public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("79!");

        Caller caller = new Caller();
        // caller.start();
        // caller.init();
    }
}

class Caller {
    private void init() {
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}