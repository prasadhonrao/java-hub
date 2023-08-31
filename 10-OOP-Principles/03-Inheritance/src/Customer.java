import java.time.LocalDate;
import java.time.Period;

public class Customer {

    // Fields
    private int id;
    private String name;
    private LocalDate birthDate;
    private String city;

    // Default Constructor
    public Customer() {
    }

    // Parameterized Constructor
    public Customer(int id, String name, LocalDate birthDate, String city) {
        setId(id);
        setName(name);
        setBirthDate(birthDate);
        setCity(city);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCity() {
        return city;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("Birth date cannot be null.");
        }
        this.birthDate = birthDate;
    }

    public void setCity(String city) {
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty.");
        }
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

     // getAge method
     public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}
