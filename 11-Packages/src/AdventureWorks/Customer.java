package AdventureWorks;

public class Customer {
    private int customerId;
    private String firstName;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Customer(int customerId, String firstName) {
        this.customerId = customerId;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "AdventureWorks Customer [customerId=" + customerId + ", firstName=" + firstName + "]";
    }

}
