package Northwind;

public class Customer {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id cannot be less than 0");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(int id, String name) {
        setId(id);
        setName(name);
    }

    @Override
    public String toString() {
        return "Northwind Customer [id=" + id + ", name=" + name + "]";
    }

}
