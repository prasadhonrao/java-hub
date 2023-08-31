import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("103!");

        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1);
        points.remove(null);
        System.out.println(points);
    }
}
