import java.io.File;
import java.io.FileFilter;

public class App {

    static String dirPath = "C:\\6287192\\github\\thegeekspad\\java-all-in-one\\Lambdas\\03-FileFilter-Lambda\\src";



    public static void main(String[] args) throws Exception {
        System.out.println("File Filter Lambda!");
        FilterFilesUsingConcreteClass();
        FilterFilesUsingAnonymousClass();
        FilterFilesUsingLambdas();
    }
   

    private static void FilterFilesUsingConcreteClass() {
        JavaFileFilter fileFilter = new JavaFileFilter();
        File dir = new File(dirPath);
        File[] javaFiles = dir.listFiles(fileFilter);
        for (File f: javaFiles) {
            System.out.println(f.getName());
        }
    }

    private static void FilterFilesUsingAnonymousClass() {
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        File dir = new File(dirPath);
        File[] javaFiles = dir.listFiles(fileFilter);
        for (File f: javaFiles) {
            System.out.println(f.getName());
        }

    }

    private static void FilterFilesUsingLambdas() {
        FileFilter fileFilter = (File file) -> file.getName().endsWith(".java");
        File dir = new File(dirPath);
        File[] javaFiles = dir.listFiles(fileFilter);
        for (File f: javaFiles) {
            System.out.println(f.getName());
        }
    }
}
