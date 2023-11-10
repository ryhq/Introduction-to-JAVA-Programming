import java.util.Scanner;

public class Question17C03 {
    public static void main(String[] args) {
        int randomNumber = 1 + (int)((Math.random() * 10) % 3); // Generate random number (1, 2 and 3)
        int guessedNumber;
        System.out.println("\nSelect the following to play the game : \n\n01.\tScissor, A scissor can cut a paper" //
         + "\n02.\tRock, A rock can knock a scissor" //
         + "\n03.\tPaper, A paper can wrap a rock\n");
        System.out.print("Scissor (1), Rock (2), Paper (3) : ");
        try(Scanner getNumber = new Scanner(System.in)){
            guessedNumber = getNumber.nextInt();
        }
        if (guessedNumber != 1 && guessedNumber != 2 && guessedNumber != 3 ) {
            System.out.println("\nPlease follow instruction\n");
        }else{
            if (randomNumber == 1 && guessedNumber == 3) {
                System.out.println("\nSorry! you lose, the computer have choosed a Scissor which cuts your paper\n");
            }else if(randomNumber == 3 && guessedNumber == 1){
                System.out.println("\nCongratulation! you won, you have choosed a Scissor which cuts computer's paper\n");
            }else if (randomNumber == 2 && guessedNumber == 1) {
                System.out.println("\nSorry! you lose, the computer have choosed a Rock which knocks your Scissor\n");
            }else if (randomNumber == 1 && guessedNumber == 2) {
                System.out.println("\nCongratulation! you won, you have choosed a Rock which knocks computer's Scissor\n");
            }else if (randomNumber == 3 && guessedNumber == 2) {
                System.out.println("\nSorry! you lose, the computer have choosed a Paper which wraps your Rock\n");
            }else if (randomNumber == 2 && guessedNumber == 3) {
                System.out.println("\nCongratulation! you won, you have choosed a Paper which wraps computer's Rock\n");
            }else if (randomNumber == guessedNumber) {
                System.out.println("\nYou have same choice as the computer!!! Try again Please\n");
            }
        }
    }
}
