import java.util.Scanner;

public class Question48C05 {
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
            String oddPhrase = "";
            for (int i = 0; i < phraseLength; i++) {
                if (i % 2 == 0) {
                    oddPhrase += phrase.charAt(i);
                }
            }
            System.out.println("\nThe new odd phrase is : " + oddPhrase + "\n");
        }
    }
}
