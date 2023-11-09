import java.util.Scanner;

public class Question10C03 {
    public static void main(String[] args) {
        int number1, number2, answer;
        number1 = (int) (Math.random() * 100);
        number2 = (int) (Math.random() * 100);
        System.out.print("\nWhat is the value of " + number1 + " + " + number2 + " : ");
        try(Scanner getAnswer = new Scanner(System.in)) {
            answer = getAnswer.nextInt();
        }
        if( number1 + number2 == answer ){
            System.out.println("\n" + number1 + " + " + number2 + " = " + answer + " Correct\n");
        }else{
            System.out.println("\n" + number1 + " + " + number2 + " != " + answer + " Incorrect\n\nThe answer is " + (number1 + number2) + "\n");
        }
    }
}
