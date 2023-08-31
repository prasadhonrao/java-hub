import java.time.LocalDate;

public class Customer {

    // Fields
    int id;
    String name;
    LocalDate birthDate;
    String city;

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(int id, String name, LocalDate birthDate, String city) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.city = city;
    }

     // toString method
     @Override
     public String toString() {
         return "Customer [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", city=" + city + "]";
     }
   
}
