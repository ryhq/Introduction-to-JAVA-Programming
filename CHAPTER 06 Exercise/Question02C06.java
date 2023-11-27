import java.util.Scanner;

public class Question02C06 {
    public static int sumDigits(long interger) {
        int sum = 0;
        long theNumber;
        theNumber = interger;
        while (theNumber != 0) {
            sum += theNumber % 10;
            theNumber = theNumber / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        try(Scanner getInterger = new Scanner(System.in)){
            System.out.print("\nEnter an integer : ");
            long integer = getInterger.nextLong();
            while (integer == 0) {
                System.out.print("\nEnter an integer : ");
                integer = getInterger.nextInt();                
            }
            System.out.println("\nSum of all its digits : " + sumDigits(integer) + "\n");
        }
    }
}
