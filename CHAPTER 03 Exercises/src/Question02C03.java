import java.util.Scanner;

public class Question02C03 {
    public static void main(String[] args) {
        int number1, number2, number3, answer;
        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);
        number3 = (int) (Math.random() * 10);
        System.out.print("\nWhat is the value of " + number1 + " + " + number2 + " + " + number3 + " : ");
        try(Scanner getAnswer = new Scanner(System.in)) {
            answer = getAnswer.nextInt();
        }
        if( number1 + number2 + number3 == answer ){
            System.out.println("\n" + number1 + " + " + number2 + " + " + number3 + " = " + answer + " Correct\n");
        }else{
            System.out.println("\n" + number1 + " + " + number2 + " + " + number3 + " != " + answer + " Incorrect\n\nThe answer is " + (number1 + number2 + number3) + "\n");
        }
    }
}
