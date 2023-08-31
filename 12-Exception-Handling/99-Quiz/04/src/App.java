public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exception Handling Quiz 4!");

        StringBuilder sb = new StringBuilder();
        String str = null;

        try {
            sb.append("a");
            str.toUpperCase();
            sb.append("b");
        } catch (IllegalArgumentException e) {
            sb.append("c");
        } catch (Exception e) {
            sb.append("d");
        } finally {
            sb.append("e");
        }

        System.out.println(sb.toString());
    }
}
