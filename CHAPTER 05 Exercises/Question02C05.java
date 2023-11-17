import java.util.Scanner;

public class Question02C05 {
    public static void main(String[] args) {
        int answer, correctAnswer = 0;
        long startTime = System.currentTimeMillis();
        try(Scanner getAnswer = new Scanner(System.in)){
            for (int i = 1; i <= 5; i++) {
                int numberOne = (int) (1 + Math.random() * 16);
                int numberTwo = (int) (1 + Math.random() * 16);
                System.out.print("\nWhat is " + numberOne + " + " +  numberTwo + " ? ");
                answer = getAnswer.nextInt();
                if (answer != (numberOne + numberTwo)) {
                    System.out.print(" incorrect! ");
                    System.out.println("\nWrong Answer\n\n" + numberOne + " + " + numberTwo + " is " + ( numberOne +  numberTwo ) + "\n");
                }else{
                    correctAnswer++;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("\nYou scored " + (correctAnswer / 5.0) * 100 + "%\n\nTest time was " + testTime / 1000 + " seconds\n" );
    }
}
