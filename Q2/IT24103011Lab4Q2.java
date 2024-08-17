import java.util.Scanner;

public class IT24103011Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input exam marks
        int exMark;
        do {
            System.out.print("Please enter exam marks (out of 100): ");
            exMark = input.nextInt();
            if (exMark < 0 || exMark > 100) {
                System.out.println("Invalid input for exam marks. Marks should be between 0 and 100.");
            }
        } while (exMark < 0 || exMark > 100);

        // Input lab submission marks
        int labMark;
        do {
            System.out.print("Please enter lab submission marks (out of 100): ");
            labMark = input.nextInt();
            if (labMark < 0 || labMark > 100) {
                System.out.println("Invalid input for lab submission marks. Marks should be between 0 and 100.");
            }
        } while (labMark < 0 || labMark > 100);

        // Input percentages for exam and lab submission
        int exPecntge;
        int labPecntge;
        do {
            System.out.print("Please enter the percentage given for exam: ");
            exPecntge = input.nextInt();
            System.out.print("Please enter the percentage given for lab submission: ");
            labPecntge = input.nextInt();
            if (exPecntge + labPecntge != 100) {
                System.out.println("The percentages must add up to 100. Please try again.");
            }
        } while (exPecntge + labPecntge != 100);

        // Calculate final marks
        double finalMarks = (exMark * exPecntge / 100.0) + (labMark * labPecntge / 100.0);

        // Display final marks
        System.out.printf("Final marks: %.2f\n", finalMarks);
    }
}