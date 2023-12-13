import java.util.Scanner;
public class Question01C07 {

    public static char gradeAnalyser(double score) {
        if (score >= 70 && score <= 100) {
            return 'A';
        }else if (score >= 50 && score < 70) {
            return 'B';
        }else if (score >= 40 && score < 50) {
            return 'C';
        }else if (score >= 30 && score < 40) {
            return 'D';
        }else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        try(Scanner getData = new Scanner(System.in)){
            System.out.print("\nEnter the number of students : ");
            int students = getData.nextInt();
            while (students <= 0) {
                System.out.print("\nEnter the number of students : ");
                students = getData.nextInt();                
            }
            double[] studentScores = new double[students];
            for (int i = 0; i < studentScores.length; i++) {
                System.out.print("\nEnter a for student " + (i + 1) + " : ");
                studentScores[i] = getData.nextDouble();
                while (studentScores[i] > 100 || studentScores[i] < 0) {
                    System.out.print("\nEnter a for student " + (i + 1) + " : ");
                    studentScores[i] = getData.nextDouble();                    
                }
            }
            double bestScore = studentScores[0];
            int counter = 1;
            for (double score : studentScores) {
                if (score > bestScore) {
                    bestScore = score;
                }
                System.out.print("\nStudent " + counter + " score is " + studentScores[counter - 1] + " and grade is " + gradeAnalyser(studentScores[counter - 1]));
                counter++;
            }
            System.out.print("\nBest Score is " + bestScore + " and grade is " + gradeAnalyser(bestScore) + "\n");
        }
    }
}
