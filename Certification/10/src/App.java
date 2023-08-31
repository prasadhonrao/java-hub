public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 10!");
        DVD d = new DVD(10, 20);
        System.out.println(d.r + " " + d.c);
    }
}

class CD {
    int r;

    CD(int r) {
        this.r = r;
    }
}

class DVD extends CD {
    int c;

    DVD(int r, int c) {
        super(r);
        this.c = c;
    }
}
