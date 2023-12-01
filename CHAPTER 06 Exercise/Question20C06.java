import java.util.Scanner;

public class Question20C06 {
    public static int countLetters(String s){
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char Character = s.charAt(i);
            if (
                (int) Character >= 65 && (int) Character <= 90 ||
                (int) Character >= 97 && (int) Character <= 122 
            ) {
               length++; 
            }
        }
        return length;
    }
    public static void main(String[] args) {
        try(Scanner getString = new Scanner(System.in)){
            System.out.print("\nEnter a string : ");
            String text = getString.nextLine();
            System.out.println("\nYour string have " + countLetters(text) + " letters\n");
        }
    }
}
