public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("String Equality Quiz!");

        String a = "hi";
        String b = "HI".toLowerCase();
        System.out.println(a == b); // reference equal
        System.out.println(a.equals(b)); // value equal (character by character comparison)

    }
}

