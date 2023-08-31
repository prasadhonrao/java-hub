public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("108!");

        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

        // while(idx < size - 1){
        //     idx++;
        // }

        do {
            idx++;
        } while (idx < size - 1);
        

        System.out.println("The top element: " + stack[idx]);
    }
}
