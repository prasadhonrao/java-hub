import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("89!");

        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        int f = ps.indexOf(p2);

        if (f >= 0) {
            System.out.println("Mike's index is " + f);
            System.out.println("Mike Found");
        }
    }
}
