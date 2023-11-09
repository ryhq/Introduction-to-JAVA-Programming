import java.util.Scanner;

public class Question12C03 {
    public static void main(String[] args) {
        int number, lastDigit, firstDigit;
        try(Scanner getNumber = new Scanner(System.in)){
            System.out.print("\nEnter a three-digit integer : ");
            number = getNumber.nextInt();
            if ( number > 999 ) {
                System.out.println("\nOnly three digit integer are accepted");
            }else{
                lastDigit = number % 10;
                firstDigit = (number - (number % 100)) / 100;
                if (lastDigit == firstDigit) {
                    System.out.println("\n" + number + " is a palindrome\n");
                }else{
                    System.out.println("\n" + number + " is not a palindrome\n");
                }
            }
        }
    }
}
