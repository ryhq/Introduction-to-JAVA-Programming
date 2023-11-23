import java.util.Scanner;

public class Question46C05 {
    public static void main(String[] args) {
        String phrase;
        try(Scanner getPhrase = new Scanner(System.in)){
            System.out.print("\nEnter a phrase : ");
            phrase = getPhrase.nextLine();
            while (phrase.length() == 0) {
                System.out.print("\nEnter a phrase : ");
                phrase = getPhrase.nextLine();
            }
            int phraseLength = phrase.length();
            System.out.print("\nReversed phrase : ");
            for (int i = phraseLength - 1; i >= 0; i--) {
                System.out.print(phrase.charAt(i));
            }
            System.out.println("\n");
        }
    }
}
