import java.util.Scanner;

public class ModSummation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask user for an integer input
        System.out.print("Even Summation of 1 to n? ");
        int n = input.nextInt();

        // Initialize total variable to 0
        int total = 0;

        // Loop from 1 to n (inclusive) and add each even value to the total
        for (int count = 1; count <= n; count++) {
            if (count % 2 == 0) {
                total += count;
            }
        }

        // Print the total
        System.out.println("Sum: " + total);
    }
}
