import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Certification Exam Question 2!");

        String date = LocalDate
                      .parse("2014-05-04")
                      .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}
