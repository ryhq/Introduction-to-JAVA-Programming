import java.util.Scanner;

public class Question04C06 {    
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
    public static void main(String[] args) {
        try(Scanner getNumber = new Scanner(System.in)){
            System.out.print("\nEnter a number : ");
            int number = getNumber.nextInt();
            while (number <= 0) {
                System.out.println("\n" + number + " is not accepted!\n");
            }
            System.out.println("\nThe reverse number of " + number + " is " + reverse(number) + "\n");
        }
    }
}
