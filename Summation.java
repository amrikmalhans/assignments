import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask user for an integer input
        System.out.print("Summation of 1 to n? ");
        int n = input.nextInt();

        // Initialize total variable to 0
        int total = 0;

        // Loop from 1 to n (inclusive) and add each value to the total
        for (int count = 1; count <= n; count++) {
            total += count;
        }

        // Print the total
        System.out.println("Sum: " + total);
    }
}
