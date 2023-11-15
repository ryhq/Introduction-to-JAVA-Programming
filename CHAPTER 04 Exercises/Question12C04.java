import java.util.Scanner;

public class Question12C04 {
    public static void main(String[] args) {
        String hexNumber;
        System.out.print("\nEnter Hexadecimal number : ");
        try(Scanner getNumber = new Scanner(System.in)){
            hexNumber = getNumber.next();
            if (!hexNumber.matches("[0-9A-Fa-f]+")) {
                System.out.println("\nInvalid Hexadecimal Number\n");
            }else{
                System.out.println("\n" + hexNumber + " hexadecimal number is equivalent to " + Integer.toBinaryString(Integer.parseInt(hexNumber, 16)) + " binary number\n");
            }
        }
    }
}
