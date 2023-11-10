import java.util.Scanner;

public class Question26C03 {
    public static void main(String[] args) {
        int number;
        System.out.print("\nEnter an integer : ");
        try(Scanner getNumber = new Scanner(System.in)){
            number = getNumber.nextInt();
        }
        if (number % 5 == 0 && number % 6 == 0 ) {
            System.out.println("\nIs " + number + " divisible by 5 and 6? true\n");
        }else{
            System.out.println("\nIs " + number + " divisible by 5 and 6? false\n");
        }
        if (number % 5 == 0 || number % 6 == 0 ) {
            System.out.println("\nIs " + number + " divisible by 5 or 6? true\n");
        }else{
            System.out.println("\nIs " + number + " divisible by 5 or 6? false\n");
        }
        if (number % 5 == 0 ^ number % 6 == 0 ) {
            System.out.println("\nIs " + number + " divisible by 5 or 6, but not both? true\n");
        }else{
            System.out.println("\nIs " + number + " divisible by 5 or 6, but not both? false\n");
        }
    }
}
