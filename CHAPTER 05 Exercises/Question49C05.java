import java.util.Scanner;

public class Question49C05 {
    public static void main(String[] args) {
        String phrase;
        try(Scanner getPhrase = new Scanner(System.in)){
            System.out.print("\nEnter a phrase : ");
            phrase = getPhrase.nextLine();
            while (phrase.length() == 0) {
                System.out.print("\nEnter a phrase : ");
                phrase = getPhrase.nextLine();                
            }
            phrase = phrase.toUpperCase(); // Converting the whole phrase to uppercase letters
            int totalCharaters = phrase.length(), totalVowel = 0, totalConsonants = 0, totalSpecialCharacters = 0;
            for (int i = 0; i < totalCharaters; i++) {
                if (
                    ((int)phrase.charAt(i)) == 65 || 
                    ((int)phrase.charAt(i)) == 69 || 
                    ((int)phrase.charAt(i)) == 73 || 
                    ((int)phrase.charAt(i)) == 79 || 
                    ((int)phrase.charAt(i)) == 85
                ) {
                    totalVowel++;
                } else if (((int)phrase.charAt(i)) >= 65 && ((int)phrase.charAt(i)) <= 90) {
                    totalConsonants++;
                }
            }
            totalSpecialCharacters = (
                totalCharaters != (totalConsonants + totalVowel)
                ) ? 
                totalSpecialCharacters = totalCharaters - (totalConsonants + totalVowel) : 
                totalSpecialCharacters;
            System.out.println("\nThe number of vowels is : " + totalVowel);
            System.out.println("\nThe number of consonants is : " + totalConsonants);
            if (totalSpecialCharacters != 0) {
                System.out.println("\nThe number of special Character including spaces is : " + totalSpecialCharacters + "\n");   
            }
        }
    }
}
