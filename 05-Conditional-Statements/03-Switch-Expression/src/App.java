import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Switch Expression!");

        Date date = new Date();
        final int month = date.getMonth();

        String monthName = switch (month) {
            case 0 -> "January";
            case 1 -> "February";
            case 2 -> "March";
            case 3 -> "April";
            case 4 -> "May";
            case 5 -> "June";
            case 6 -> "July";
            case 7 -> "August";
            case 8 -> "September";
            case 9 -> "October";
            case 10 -> "November";
            case 11 -> "December";
            default -> "Invalid month!";
        };

        System.out.println(monthName);
    }
}
