import java.text.NumberFormat;
import java.util.Scanner;

public class DecimalToCurrency {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double amount = input.nextDouble();

        // Create a NumberFormat object
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        // Set the currency to US dollar
        currencyFormat.setCurrency(java.util.Currency.getInstance("USD"));

        // Display the result
        String result = currencyFormat.format(amount);
        System.out.println("Currency format: " + result);
    }
}
