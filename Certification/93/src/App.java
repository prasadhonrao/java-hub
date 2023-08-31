public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("93!");
    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Employee(String name, int age, int salary) {
        setSalary(salary);
        this(name, age);
    }

    private void setAge(int age2) {
        this.age = age2;
    }

    private void setName(String name) {
        this.name = name;
    }
    private void setSalary(int salary2) {
        this.salary = salary2;
    }
  
    public void printDetails() {
        System.out.println(name + " " + age + " " + salary);
    }
}


class Tes {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("John", 30, 4000);
        Employee e3 = new Employee("Rachel", 25, 3000);
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}