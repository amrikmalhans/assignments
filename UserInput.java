import java.util.Scanner;

public class UserInput {
    private String username;

    public UserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter username: ");
            this.username = scanner.nextLine();
        }
    }

    public String getUsername() {
        return this.username;
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        System.out.println("Your username is: " + userInput.getUsername());
    }
}
