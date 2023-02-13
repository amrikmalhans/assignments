import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        // Read the first number
        double val1 = in.nextDouble();
        System.out.print("Enter the second number: ");
        // Read the second number
        double val2 = in.nextDouble();
        System.out.print("Enter the third number: ");
        // Read the third number
        double val3 = in.nextDouble();

        // First we find the largest number among the first two numbers and store it in
        // max
        double max = Math.max(val1, val2);
        // Then we find the largest number among the third number and the number stored
        // in max and store it in max
        max = Math.max(max, val3);

        // Similarly, we find the smallest number among the first two numbers and store
        // it in min
        double min = Math.min(val1, val2);
        // Then we find the smallest number among the third number and the number stored
        // in min and store it in min
        min = Math.min(min, val3);

        // Print the result
        System.out.println("The smallest number is " + min + " and the largest is " + max);
    }
}
