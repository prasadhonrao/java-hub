public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("92!");

        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwds[] = new String [3];
        int idx = 0;

        try {
            for (String n : names) {
                pwds[idx] = n.substring(2, 6);
                idx++;
            }
        }
        catch (Exception e) {
            System.out.println("Invalid name");
        }
        for (String p : pwds) {
            System.out.println(p);
        }
    }
}
