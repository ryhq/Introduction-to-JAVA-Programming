public class GenerateRandomWord {
    public static char generateRandomCharacter() {
        return (char) (int) (65 + Math.random() * 25);
    }
    public static String generateRandomWord(){
        String randomWord = "";
        for (int i = 1; i <= 4; i++) {
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
        for (int i = 0; i < 20; i++) {
            System.out.println("\nRandom word : " + generateRandomWord() + "\n");
        }
    }
}
