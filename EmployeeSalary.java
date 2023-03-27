// Define Employee class
class Employee {
    private double salary;
    private int hours;

    // Get information about salary and number of hours worked
    public void getInfo(double salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    // Add $10 to salary if it is less than $500
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    // Add $5 to salary if the number of hours worked per day is more than 6 hours
    public void addWork() {
        if (hours > 6) {
            salary += 5;
        }
    }

    // Get the final salary
    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        // Create Employee object and set the initial salary and number of hours worked
        Employee emp = new Employee();
        // Add salary and work bonuses to the salary
        emp.getInfo(450, 8);
        emp.addSal();
        emp.addWork();
        System.out.println("Final salary: $" + emp.getSalary());
    }
}
