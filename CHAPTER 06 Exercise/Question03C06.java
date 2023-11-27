import java.util.Scanner;

public class Question03C06 {
    public static int reverse(int number) {
        int reverse = 0;
        int theNumber = number;
        int times = 1;
        for (
                int i = 1; 
                i < String.valueOf(number).length(); // Determining the length of number
                i++
            ) {
            times *= 10;
        }
        while (theNumber != 0) {
            reverse += (theNumber % 10) * times;
            theNumber = theNumber / 10;
            times /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number) {
        boolean palindrome = false;
        if (reverse(number) == number) {
            palindrome = true;
        }
        return palindrome;
    }
    public static void main(String[] args) {
        try(Scanner getNumber = new Scanner(System.in)){
            System.out.print("\nEnter a number : ");
            int number = getNumber.nextInt();
            if (isPalindrome(number)) {
                System.out.println("\n" + number + " is a palindrome\n");
            }else{
                System.out.println("\n" + number + " is not a palindrome\n");
            }
        }
    }
}
