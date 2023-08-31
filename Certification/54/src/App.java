public class App {
    public static void main(String[] args)  {
        System.out.println("54!");

       args[0] = "1";

        System.out.println("String main " + args[0]);
    }

    public static void main(int[] args)  {
        System.out.println("int main " + args[0]);
    }

    public static void main(Object[] args)  {
        System.out.println("Object main " + args[0]);
    }
}
