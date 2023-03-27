public class ReverseMultiplicationTable {
    public static void main(String[] args) {
        // Loop through the numbers 10 to 1 (inclusive) and print the multiplication
        // table for each number
        for (int i = 10; i >= 1; i--) {
            System.out.println("Multiplication table of " + i + ":");
            for (int j = 10; j >= 1; j--) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println(); // add a blank line between tables
        }
    }
}
