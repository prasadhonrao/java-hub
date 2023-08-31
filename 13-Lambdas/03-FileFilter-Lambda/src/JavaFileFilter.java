import java.io.File;
import java.io.FileFilter;

public class JavaFileFilter implements FileFilter {

    @Override
    public boolean accept(final File file) {
        return file.getName().endsWith(".java");
    }
}