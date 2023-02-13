import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        // Declare scanner object to read input from the console
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        // Read the first number
        double number1 = in.nextDouble();

        System.out.print("Enter the second number: ");
        // Read the second number
        double number2 = in.nextDouble();
        System.out.print("Enter the operation (add, sub, mul, div, exp, sqrt, log): ");
        // Read the operator
        String operator = in.next();

        // Declare the result variable to store the result of the operation
        // and print it to the console
        double result;

        // Use if-else statement to perform the operation
        if (operator.equals("add")) { // Use .equals() to compare strings
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        } else if (operator.equals("div")) {
            result = number1 / number2;
        } else if (operator.equals("exp")) {
            result = Math.pow(number1, number2);
        } else if (operator.equals("sqrt")) {
            result = Math.sqrt(number1);
        } else if (operator.equals("log")) {
            result = Math.log10(number1) / Math.log10(number2); // use Math class
        } else {
            // If the operator is not one of the above, print an error message
            System.out.println("Invalid operator " + operator);
            return;
        }

        // Print the result
        System.out.println("Result: " + result);
    }
}
