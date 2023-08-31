import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Switch Case Quiz!");

        Date date = new Date();
        final int month = date.getMonth();

        switch (month) {
            case 0:
            case 1:
            case 2:
                System.out.println("Q1");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Q2");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Q3");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Q4");
                break;
            default:
                System.out.println("Invalid month!");
                break;
            
        }
    }
}
