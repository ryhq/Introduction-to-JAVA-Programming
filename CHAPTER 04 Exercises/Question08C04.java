import java.util.Scanner;

public class Question08C04 {
    public static void main(String[] args) {
        int ASCII_CODE;
        System.out.print("\nEnter an ASCII code : ");
        try(Scanner getASCII = new Scanner(System.in)){
            ASCII_CODE = getASCII.nextInt();
            System.out.println("\nThe character for ASCII code " + ASCII_CODE + " is " + (char) ASCII_CODE + "\n");
        }
    }
}
