import java.util.Scanner;

public class Loop {
    // take number of subjects from user
    // create an array of that size
    // take marks from user for each subject

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int num = sc.nextInt();

        int[] marks = new int[num];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for subject " + (i + 1));
            marks[i] = sc.nextInt();

        }
        sc.close();

    }
}
