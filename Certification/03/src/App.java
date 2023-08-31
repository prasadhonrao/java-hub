public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 3!");

        short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;
        String s4 = (String) (s3 * s2);
        System.out.println("Sum is " + s4);
    }
}
