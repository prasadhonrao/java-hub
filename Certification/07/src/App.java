public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 7!");

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if (sb.toString().equals(s.toString()))
            System.out.println("Match 1");
        else if (sb.equals(s))
            System.out.println("Match 2");
        else
            System.out.println("No Match");
    }
}
