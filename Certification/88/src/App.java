public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("88!");

        String stuff = "TV";
        String res = null;

        if (stuff.equals("TV")) {
            res = "Walter";
        } else if (stuff.equals("Movie")) {
            res = "White";
        } else {
            res = "No result";
        }

        System.out.println(res);

        res = stuff.equals("TV")? "Walter" : stuff.equals("Movie")? "White" : "No result";
        System.out.println(res);
    }
}
