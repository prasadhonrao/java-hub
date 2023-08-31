public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("32!");

        Aplha a1 = new Aplha(100);
        Aplha a2 = new Aplha(50);
        Aplha a3 = new Aplha(125);
        a1.doPrint();
        a2.doPrint();
        a3.doPrint();

    }
}

class Aplha {
    int ns;
    static int s;

    Aplha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}
