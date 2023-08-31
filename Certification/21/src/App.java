public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("21!");

        Employee e = new Employee();
        // e.name = "Joe";
        // e.contract = true;
        // e.salary = 100;

        System.out.println(e);
    }
}


class Employee {
    String name;
    boolean contract;
    double salary;

    Employee() {
        this.name = new String("Joe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }
}