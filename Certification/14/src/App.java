public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("14!");

        String shirts [][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        // for (int index = 0; index <2; ++index) {
        //     for (int idx = 0; idx < index; ++idx) {
        //         System.out.println(shirts[index][idx] + ":");
        //     }
        // }

        for (String[] c: shirts) {
            for (String s: c) {
                System.out.print(s + ":");
            }
        }
    }
}
