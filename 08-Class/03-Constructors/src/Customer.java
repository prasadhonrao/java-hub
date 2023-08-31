import java.time.LocalDate;

public class Customer {

    // Fields
    private int id;
    private String name;
    private LocalDate birthDate;
    private String city;

    // Default Constructor
    public Customer() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    public Customer(int id, String name, LocalDate birthDate, String city) {
       this.id = id;
       this.name = name;
       this.birthDate = birthDate;
       this.city = city;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
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
