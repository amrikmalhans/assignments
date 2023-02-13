import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double number = in.nextDouble();

        double absoluteValueByCalculation = number >= 0 ? number : -number;
        double absoluteValueByMathAbs = Math.abs(number);

        System.out.println("Absolute value by calculation: " + absoluteValueByCalculation +
                " and " + absoluteValueByCalculation +
                ", by Math.abs() method: " + absoluteValueByMathAbs);
    }
}
