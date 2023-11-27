import java.util.Scanner;

public class Question10C06 {
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        try(Scanner getNumber = new Scanner(System.in)){
            System.out.print("\nEnter an integer : ");
            int integer = getNumber.nextInt();
            if (integer < 0) {
                System.out.println("\nNon-positive numbers are not acceptable\n");
            }else{
                if (isPrime(integer)) {
                    System.out.println("\n" + integer + " is prime number\n");
                }else{
                    System.out.println("\n" + integer + " is not prime number\n");
                }
            }
        }
    }
}
