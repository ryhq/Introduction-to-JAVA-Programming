import java.util.Scanner;

public class Question11C04 {
    public static void main(String[] args) {
        int intNumber;
        String hexNumber;
        System.out.print("\nEnter an integer : ");
        try(Scanner input = new Scanner(System.in)){
            intNumber = input.nextInt();
        }
        hexNumber = Integer.toHexString(intNumber);
        System.out.println("\n" + intNumber + " integer number is equivalent to " + hexNumber.toUpperCase() + " hexadecimal number\n");
    }
}
