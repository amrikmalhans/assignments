import java.util.Scanner;

class Average {
    public double calculateAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        return average;
    }
}

public class AverageDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Average averageObj = new Average();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double result = averageObj.calculateAverage(num1, num2, num3);
        System.out.println("Average of three numbers is: " + result);
    }
}
