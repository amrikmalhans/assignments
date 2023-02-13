import java.util.Scanner;

public class Honorific {
    public static void main(String[] args) {
        // Get name from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();

        // Find the first and last names
        int pos = name.indexOf(" ");
        String first = name.substring(0, pos);
        String last = name.substring(pos + 1);

        // Get the first initial
        char initial = first.charAt(0);

        // Print the honorific
        System.out.println("Honorific: Dr. " + initial + ". " + last);
    }
}
