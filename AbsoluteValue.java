import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value: ");
        // Read a double value
        double number = in.nextDouble();

        // Calculate the absolute value using conditional operator
        double absoluteValueByCalculation = number >= 0 ? number : -number;
        double absoluteValueByMathAbs = Math.abs(number);

        // Display the result
        System.out.println("Absolute value by calculation: " + absoluteValueByCalculation +
                " and " + absoluteValueByCalculation +
                ", by Math.abs() method: " + absoluteValueByMathAbs);
    }
}
