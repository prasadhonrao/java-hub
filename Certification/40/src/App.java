public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("40!");

        System.out.println(maskCC("1234-5678-9012-3456"));
    }

    public static String maskCC(String cc) {
        String x = "XXXX-XXXX-XXXX-";

        StringBuilder sb = new StringBuilder(x);
        sb.append(cc, 15, 19);
        return sb.toString();

        // return x + cc.substring(15, 19);
    }
}
