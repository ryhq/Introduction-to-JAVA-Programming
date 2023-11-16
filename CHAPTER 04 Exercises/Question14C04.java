import java.util.Scanner;

public class Question14C04 {
    public static void main(String[] args) {
        char grade;
        System.out.print("\nEnter a letter grade (A, B, C, D, or F): ");
        try(Scanner getGrade = new Scanner(System.in)){
            grade = getGrade.next().toUpperCase().charAt(0);
            getGrade.close();
        }

        int numericValue;

        switch (grade) {
            case 'A':
                numericValue = 4;
                break;
            case 'B':
                numericValue = 3;
                break;
            case 'C':
                numericValue = 2;
                break;
            case 'D':
                numericValue = 1;
                break;
            case 'F':
                numericValue = 0;
                break;
            default:
                System.out.println("\n" + grade + " is Invalid grade. Please enter a valid letter grade.\n");
                return;
        }

        System.out.println("\nThe numeric value for grade " + grade + " is: " + numericValue + "\n");
    }
}