import java.util.Scanner;

public class Question23C06 {
    public static int count(String str, char a){
        int occurance = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == a) {
                occurance++;
            }
        }
        return occurance;
    }
    public static void main(String[] args) {
        try(Scanner getString = new Scanner(System.in)){
            System.out.print("\nEnter a string : ");
            String text = getString.nextLine();
            System.out.print("\nEnter a character to check : ");
            char character = getString.nextLine().charAt(0);
            System.out.println("\nYour string contains " + count(text, character) + ", " + character + "\n");
        }
    }
}
