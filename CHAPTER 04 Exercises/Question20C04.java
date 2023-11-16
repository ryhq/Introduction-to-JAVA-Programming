import java.util.Scanner;

public class Question20C04 {
    public static void main(String[] args) {
        String phrase;
        System.out.print("\nType anything here : ");
        try(Scanner getPhrase = new Scanner(System.in)){
            phrase = getPhrase.nextLine();
        }
        System.out.println("\nThe phrase has " +  phrase.length() + " characters and the first character is \'" + phrase.charAt(0) +"\'\n");
    }
}
