public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exception Handling Quiz 3!");

        StringBuilder sb = new StringBuilder();

        try {
            sb.append("a");
        } catch (RuntimeException rex) {
            sb.append("b");
        }
        finally {
            sb.append("c");
        }
        sb.append("d");

        System.out.println(sb.toString());
    }
}
