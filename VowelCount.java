import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask user for a string input
        System.out.print("Enter a string: ");
        String str = input.nextLine().toLowerCase(); // convert to lowercase for easier matching

        // Initialize counting variables for each vowel
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        int yCount = 0;

        // Loop through each character in the string and count the occurrences of each
        // vowel
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
                case 'y':
                    yCount++;
                    break;
                default:
                    break;
            }
        }

        // Display the counts for vowels that have >0 occurrences
        if (aCount > 0) {
            System.out.println("Number of a's: " + aCount);
        }
        if (eCount > 0) {
            System.out.println("Number of e's: " + eCount);
        }
        if (iCount > 0) {
            System.out.println("Number of i's: " + iCount);
        }
        if (oCount > 0) {
            System.out.println("Number of o's: " + oCount);
        }
        if (uCount > 0) {
            System.out.println("Number of u's: " + uCount);
        }
        if (yCount > 0) {
            System.out.println("Number of y's: " + yCount);
        }
    }
}
