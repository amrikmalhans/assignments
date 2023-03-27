// define the Employee class with private fields for ID, name, and salary
class Employee {
    private int id;
    private String name;
    private double salary;

    // constructor to initialize the object with ID, name, and salary
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getter method for ID
    public int getId() {
        return id;
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // getter method for salary
    public double getSalary() {
        return salary;
    }

    // method to raise the salary by a given percentage
    public void raiseSalary(double percent) {
        double raise = salary * percent / 100;
        salary += raise;
    }
}

// main class to test the Employee class and raise the salary of an employee
public class EmployeeRaiseSalary {
    public static void main(String[] args) {
        // create an employee object with ID, name, and salary
        Employee emp = new Employee(101, "John Smith", 50000.0);
        // print the original salary of the employee
        System.out.println("Original salary: " + emp.getSalary());
        // raise the salary of the employee by 10%
        emp.raiseSalary(10);
        // print the new salary of the employee after the raise
        System.out.println("New salary after 10% raise: " + emp.getSalary());
    }
}
