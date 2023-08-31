public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("50!");

        String[] strs = new String[2];
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat("element " + idx);
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
