import java.util.Scanner;

public class Question14C03 {
    public static void main(String[] args) {
        int guessedNumber = (int) Math.round( Math.random() ), userGuessesNumber;
        System.out.println("\nConsider the following\n00.\tHead\n01.\tTail");
        System.out.print("\nGuess either (00) head or (01) tail : ");
        try(Scanner getNumber = new Scanner(System.in)){
            userGuessesNumber = getNumber.nextInt();
            if (userGuessesNumber != 0 && userGuessesNumber != 1) {
                System.out.println("\nPlease follow instruction!!!\n");
            }else{
                if (userGuessesNumber == guessedNumber) {
                    System.out.println("\nYour guess is correct\n");
                }else{
                    System.out.println("\nYour guess is incorrect\n");
                }
            }
        }
    }
}
