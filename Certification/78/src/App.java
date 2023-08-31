public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("78!");

        int[][] n = { { 1, 3}, { 2, 4 } };
        
        for (int i = n.length -1; i >= 0; i--) {
            for (int y: n[i]){
                System.out.print(y);
            }
        }

    }
}
