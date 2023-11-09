import java.util.Scanner;

public class Question15C03 {
    public static void main(String[] args) {
        int randomSecretNumber = (int) ( Math.random() * 1000 ), secretDigit1, secretDigit2, secretDigit3;
        int guessedNumber, guessedDigit1, guessedDigit2, guessedDigit3;
        System.out.println("\nWelcome to Lottery game, you are to guess three numbers and in order for you to win the game here are different rules");
        System.out.println("\nIf you guess a number that matches the lottery number in the exact order, the award is $10,000.");
        System.out.println("\nIf all digits in the number you guessed match all digits in the lottery number, the award is $3,000.");
        System.out.println("\nIf one digit in the number you guessed matches a digit in the lottery number, the award is $1,000.");
        try(Scanner getGuessedNumber = new Scanner(System.in)){
            System.out.print("\nEnter your guessed number : ");
            guessedNumber = getGuessedNumber.nextInt();
            if (guessedNumber > 999) {
                System.out.println("\nPlease follow instruction.\n");
            }else{
                secretDigit1 = (randomSecretNumber - (randomSecretNumber % 100)) / 100;
                secretDigit2 = (randomSecretNumber - ((randomSecretNumber - (randomSecretNumber % 100)))) / 10;
                secretDigit3 = randomSecretNumber % 10;
                guessedDigit1 = (guessedNumber - (guessedNumber % 100)) / 100;
                guessedDigit2 = (guessedNumber - ((guessedNumber - (guessedNumber % 100)))) / 10;
                guessedDigit3 = guessedNumber % 10;
                if (randomSecretNumber == guessedNumber) {
                    System.out.println("\nCongratulation! You won $10,000/=\n");
                }else if((secretDigit1 == guessedDigit1 || secretDigit1 == guessedDigit2 || secretDigit1 == guessedDigit3) && 
                    (secretDigit2 == guessedDigit1 || secretDigit2 == guessedDigit2 || secretDigit2 == guessedDigit3) && 
                    (secretDigit3 == guessedDigit1 || secretDigit3 == guessedDigit2 || secretDigit3 == guessedDigit3)){
                    System.out.println("\nCongratulation! You won $3,000/=, the lottery number is : " + randomSecretNumber + "\n");
                } 
                else if ((secretDigit1 == guessedDigit1 || secretDigit1 == guessedDigit2 || secretDigit1 == guessedDigit3) || 
                    (secretDigit2 == guessedDigit1 || secretDigit2 == guessedDigit2 || secretDigit2 == guessedDigit3) || 
                    (secretDigit3 == guessedDigit1 || secretDigit3 == guessedDigit2 || secretDigit3 == guessedDigit3)) {
                    System.out.println("\nCongratulation! You won $1,000/=, the lottery number is : " + randomSecretNumber + "\n");
                }else{
                    System.out.println("\nYou lose! Please try again, the lottery number is : " + randomSecretNumber + "\n");
                }
            }
        }
    }
}
