public class Fieldinit {

    char c;
    boolean b;
    float f;

    public static void main(String[] args) throws Exception {
        System.out.println("106!");

        Fieldinit app = new Fieldinit();
        app.printAll();
    }

    void printAll() {
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }
}
