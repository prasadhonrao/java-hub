public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enums!");
        
        // Enums are a special type of class that represents a group of constants
        // Enums are declared using the enum keyword
        // Enums are implicitly final
        // Enums are implicitly static
        // Enums are implicitly abstract

        // Create an enum
        Grade grade = Grade.A;
        System.out.println(grade);

        // Iterate over all the constants
        for (Grade g : Grade.values()) {
            System.out.println(g);
        }
    }

    public enum Grade {
        A, B, C, D, F
    }
}
