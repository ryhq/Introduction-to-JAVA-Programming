import java.util.Scanner;

public class Question50C05 {
    public static void main(String[] args) {
        String userString;
        try(Scanner getString = new Scanner(System.in)){
            System.out.print("\nEnter a string : ");
            userString = getString.nextLine();
            while (userString.length() == 0) {
                System.out.print("\nEnter a string : ");
                userString = getString.nextLine();
            }
            int totalCharaters = userString.length();
            int totalCapitalLetters = 0;
            for (int i = 0; i < totalCharaters; i++) {
                if (((int)userString.charAt(i) >= 65 && (int)userString.charAt(i) <= 90)) {
                    totalCapitalLetters++;
                }
            }
            System.out.println("\n In the phrase \"" + userString + "\" there are " + totalCapitalLetters + " capital letters\n");
        }
    }
}
