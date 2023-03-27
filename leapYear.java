import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class leapYear {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            File file = new File("file.txt");

            try {
                PrintWriter Print = new PrintWriter(file);

                int year = 0;

                int start = 0;

                int end = 0;

                String result = "";

                System.out.println("Enter start  year:");

                start = scan.nextInt();

                System.out.println("Enter end year:");
                end = scan.nextInt();

                for (year = start; year <= end; year++)

                {

                    result = String.format("%d is", year);
                    if (year < 1582) {
                        result = result + " invalid; for years before 1592";
                    } else if (year % 4 != 0) {
                        result += " not a leap year";
                    } else if (year % 100 != 0) {
                        result += "a leap year";
                    } else if (year % 400 != 0) {
                        result += " not a leap year";
                    } else {
                        result += " a leap year";

                    }

                    Print.println(result);
                    Print.close();
                }

            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
                // insert code to run when exception occurs
            }
        }
    }
}