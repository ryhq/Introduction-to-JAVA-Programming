import java.util.Scanner;

public class Question09C04 {
    public static void main(String[] args) {
        char character;
        System.out.print("\nEnter a character : ");
        try(Scanner getChar = new Scanner(System.in)){
            character = getChar.nextLine().charAt(0);
        }
        System.out.println("\nThe Unicode for the character " + character + " is " + (int) character + "\n");
    }
}
