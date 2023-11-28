import java.util.Scanner;

public class Question12C06 {
    public static void printChars(char character1, char character2, int lines) {
        int higherCharacterASCIICode = ((int)character1);
        int lowerCharacterASCIICode = ((int)character2);
        int counter = 1;
        if (lowerCharacterASCIICode > higherCharacterASCIICode) {
            int temporary = higherCharacterASCIICode;
            higherCharacterASCIICode = lowerCharacterASCIICode;
            lowerCharacterASCIICode = temporary;
        }
        System.out.println();
        for (int i = lowerCharacterASCIICode; i <= higherCharacterASCIICode; i++) {
            System.out.printf("%3c", ((char)i));
            if (counter % lines == 0) {
                System.out.println("\n");
            }
            counter = counter + 1;
        }
    }
    public static void main(String[] args) {
        try (Scanner getData = new Scanner(System.in)) {
            System.out.print("\nEnter starting character : ");
            char character1 = getData.next().charAt(0);
            System.out.print("\nEnter ending character : ");
            char character2 = getData.next().charAt(0);
            System.out.print("\nHow many characters per line : ");
            int lines = getData.nextInt();
            System.out.println("\n" + lines + " characters per line\n");
            printChars(character1, character2, lines);
            System.out.println("\n");
        }
    }
}
