import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        // Declare variables and create a Scanner object
        Scanner sc = new Scanner(System.in);
        String str1, str2, str3, str4;
        int totalChars;

        // Get the user's input
        System.out.print("Enter the first word: ");
        str1 = sc.next();
        System.out.print("Enter the second word: ");
        str2 = sc.next();
        System.out.print("Enter the third word: ");
        str3 = sc.next();
        System.out.print("Enter the fourth word: ");
        str4 = sc.next();

        // Calculate the total number of characters
        totalChars = str1.length() + str2.length() + str3.length() + str4.length();

        // Display the results
        System.out.println("With a total " + totalChars + " chars, in reverse, they are: " + str4 + " " + str3 + " "
                + str2 + " " + str1);

    }
}