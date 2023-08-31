import java.time.LocalDate;

public class PriorityCustomer extends Customer {
    private PriorityType priorityType;

    public PriorityCustomer(int id, String name, LocalDate birthDate, String city, PriorityType priorityType) {
        super(id, name, birthDate, city);
        setPriorityType(priorityType);
    }

    public PriorityType getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(PriorityType priorityType) {
        if (priorityType == null) {
            throw new IllegalArgumentException("Priority type cannot be null.");
        }
        this.priorityType = priorityType;
    }

    @Override
    public String toString() {
        return super.toString().replace("Customer", "Priority Customer") + ", Priority Type: " + priorityType;
    }
}
