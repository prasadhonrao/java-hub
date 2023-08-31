public class App {
    public static void main(String[] args) {
        System.out.println("15!");

        Test t = new Test();
        int cardNo = 12344;
//        t.readCard(cardNo);
        t.checkCard(cardNo);
    }
}

class Test {
    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking Card");
    }
}
