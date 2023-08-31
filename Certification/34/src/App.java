import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("34!");

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(05, 23, 2023);
        LocalDate date3 = LocalDate.parse("2023-05-23", DateTimeFormatter.ISO_DATE);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
