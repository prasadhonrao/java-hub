import java.time.LocalDate;

public class Customer {

    // Fields
    public int id;
    public String name;
    public LocalDate birthDate;
    public String city;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) obj;
        return this.id == other.id;
    }
}
