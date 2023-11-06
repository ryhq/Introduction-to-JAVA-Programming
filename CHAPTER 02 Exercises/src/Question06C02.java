import java.util.Scanner;

public class Question06C02 {
    public static void main(String[] args) {
        int integer, digit, digitSum = 0;
        try (Scanner getInteger = new Scanner(System.in)) {
            System.out.print("\nEnter a number between 0 and 1000 : ");
            integer = getInteger.nextInt();
        }
        if ( integer > 0 || integer < 9999 ) {
            for (int i = 1; i <= 4; i++) {
               digit = integer % 10;
               digitSum = digitSum + digit;
               integer = integer / 10;
            }
        }
        System.out.println("\nThe sum of all digits is : " + digitSum + "\n");
    }
}
