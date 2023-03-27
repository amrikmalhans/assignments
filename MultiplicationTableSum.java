public class MultiplicationTableSum {
    public static void main(String[] args) {
        // Initialize the sum variable to 0
        int sum = 0;

        // Loop through the numbers 1 to 10 (inclusive) and add the numbers in the
        // multiplication table of 8 to the sum
        for (int i = 1; i <= 10; i++) {
            int product = 8 * i; // calculate the product of 8 and i
            sum += product; // add the product to the sum
        }

        // Print the sum
        System.out.println("Sum of the numbers in the multiplication table of 8: " + sum);
    }
}
