public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("76!");

        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();

        employee.salary = 50_000;
        manager.salary = 80_000;
        director.salary = 100_000;

        manager.budget = 200_000;
        director.budget = 1_000_000;

        director.stockOptions = 500;
        

        // these are invalid statements
        // manager.stockOptions = 500;
        // employee.budget = 200_000;
    }
}


class Employee {
    public int salary;
}

class Manager extends Employee {
    public int budget;
}

class Director extends Manager {
    public int stockOptions;
}

