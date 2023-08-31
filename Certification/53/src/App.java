public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("53!");

        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;

        fVar = iVar;
        // iVar = fVar;
        // fVar = dVar;
        dVar = fVar;
        // iVar = dVar;
        dVar = iVar;
    }
}
