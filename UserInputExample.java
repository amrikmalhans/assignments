import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("WHAT");
        int age = console.nextInt();
        int years = 100 - age;
        System.out.println("You will be 100 in " + years + " years.");
    }
}