import java.util.Scanner;

public class Question08C05 {
    public static void main(String[] args) {
        int numberOfStudents;
        double studentScore, highScore = 0;
        String studentName, bestStudent = "";
        System.out.print("\nEnter the number of students : ");
        try(Scanner getData = new Scanner(System.in)){
            numberOfStudents = getData.nextInt();
            if (numberOfStudents <= 0) {
                System.out.println("\nInvalid Number of students \n");
            }else{
                for (int i = 1; i <= numberOfStudents; i++) {
                    System.out.print("\nEnter the name of student " + i + " : " );
                    studentName = getData.next();
                    System.out.print("\nEnter score for " + studentName + " : ");
                    studentScore = getData.nextDouble();
                    if (studentScore > highScore) {
                        highScore = studentScore;
                        bestStudent = studentName;
                    }
                }
                System.out.println("\nThe name of the student with highest score is \"" + bestStudent + "\" with " + highScore + " scores\n");
            }
        }
    }
}
