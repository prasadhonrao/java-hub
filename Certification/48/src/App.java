public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("48!");
        
        String str1 = "Java";
        String str2 = new String("java");
        if (str2.equals(str1.toLowerCase())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
