// Define the Employee class with private fields for name, year of joining, salary, and address
class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    // Constructor to initialize the fields of the Employee class
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Getter methods to access the private fields
    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}

public class EmployeeDriver {
    public static void main(String[] args) {
        // Create an array of Employee objects and initialize them with some sample data
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Robert", 1994, 5000.0, "64C- WallsStreat");
        employees[1] = new Employee("Sam", 2000, 6000.0, "68D- WallsStreat");
        employees[2] = new Employee("John", 1999, 4500.0, "26B- WallsStreat");

        // Print the table header
        System.out.printf("%-10s%-20s%-15s%s%n", "Name", "Year of Joining", "Salary", "Address");
        // Iterate through the Employee array and print each employee's data
        for (Employee employee : employees) {
            System.out.printf("%-10s%-20d%-15.2f%s%n", employee.getName(), employee.getYearOfJoining(),
                    employee.getSalary(), employee.getAddress());
        }
    }
}
