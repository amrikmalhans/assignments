import java.util.Scanner;

public class ModEvenSummation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask user for an integer input
        System.out.print("Even Summation of 1 to n? ");
        int n = input.nextInt();

        // Initialize total variable to 0
        int total = 0;

        // Loop from 2 to n (inclusive) and add each even value to the total
        for (int count = 2; count <= n; count += 2) {
            total += count;
        }

        // Print the total
        System.out.println("Sum: " + total);
    }
}
