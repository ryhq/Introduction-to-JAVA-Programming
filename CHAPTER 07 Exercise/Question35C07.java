import java.util.Arrays;
import java.util.Scanner;

public class Question35C07 {
    public static char generateRandomCharacter() {
        return (char) (int) (65 + Math.random() * 25);
    }
    public static String generateRandomWord(){
        String randomWord = "";
        for (
                int i = 1; 
                i <= 8; // Word Length
                i++
            ) {
            if (i % 2 != 0) {
                boolean noConstant = true;
                while (noConstant) {
                    char consonant = generateRandomCharacter();
                    if (
                        (int)consonant != 65 && // Excluding letter A
                        (int)consonant != 69 && // Excluding letter E
                        (int)consonant != 73 && // Excluding letter I
                        (int)consonant != 79 && // Excluding letter O
                        (int)consonant != 85 && // Excluding letter U
                        (int)consonant != 81 && // Excluding letter Q
                        (int)consonant != 88 && // Excluding letter X
                        (int)consonant != 67    // Excluding letter C
                        ) {
                        noConstant = false;
                        randomWord += consonant; 
                    }
                }
            }else{
                boolean noVowel = true;
                while (noVowel) {
                    char vowel = generateRandomCharacter();
                    if (
                        (int)vowel == 65 || 
                        (int)vowel == 69 || 
                        (int)vowel == 73 || 
                        (int)vowel == 79 || 
                        (int)vowel == 85
                        ) {
                        noVowel = false;
                        randomWord += vowel; 
                    }
                }
            }
        }
        return randomWord;
    }
    public static void main(String[] args) {
        int missed = 0;
        String randomWord = generateRandomWord();
        /* Store the characters in array */
        char[] randomWordArray = new char[randomWord.length()];
        char[] tempArray = new char[randomWord.length()];

        for (int i = 0; i < randomWordArray.length; i++) {
            randomWordArray[i] = randomWord.charAt(i);
            tempArray[i] = randomWord.charAt(i);
        }
        /* Creating another array which stores new word */
        char[] correctWord = new char[randomWord.length()];

        char guessedCharacter;
        try(Scanner getChar = new Scanner(System.in)){
            while (Arrays.equals(randomWordArray, correctWord) != true) {
                System.out.print("\n(Guess) Enter a letter in word ");
                for (char c : correctWord) {
                    if (c == '\u0000') {
                        System.out.print("*");
                    }else{
                        System.out.print(c);
                    }
                }
                System.out.print(" : ");
                guessedCharacter = getChar.next().charAt(0);
                guessedCharacter = Character.toUpperCase(guessedCharacter);
                Arrays.sort(tempArray);

                /* Checking if the guessedCharacter is in randomWordArray*/
                for (int i = 0; i < randomWordArray.length; i++) {
                    if (guessedCharacter == randomWordArray[i]) {
                        correctWord[i] = guessedCharacter;
                    }else if(Arrays.binarySearch(tempArray, guessedCharacter) < 0){
                        System.out.println("\n\t" + guessedCharacter + " is not in the word");
                        missed++;
                        break;
                    }else if(guessedCharacter == correctWord[i]){
                        System.out.println("\n\t" + guessedCharacter + " is already in the word\n");
                    }
                }
            }
        }
        System.out.println("\nThe word is : " + randomWord + "\n");
        System.out.println("\nYour missed " + missed + " times\n\n");
    }
}
