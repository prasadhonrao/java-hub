public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("35!");

        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();

        String str2 = str1;
        
        System.out.println(str1 == str2);
    }
}
