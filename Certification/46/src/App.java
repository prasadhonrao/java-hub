public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("46!");

        String[][] arr = {{"a", "b", "c"}, {"d", "e"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (arr[i][j].equals("b")) {
                    break;
                }
            }
            continue;
        }
    }
}
