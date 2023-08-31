public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("87!");

        StringBuilder sb = new StringBuilder();
        sb.append("123");
        sb.append("456");
        sb.append("789");

        System.out.println(sb.toString());

        sb.delete(0, sb.length());
        System.out.println(sb.toString());

    }
}
