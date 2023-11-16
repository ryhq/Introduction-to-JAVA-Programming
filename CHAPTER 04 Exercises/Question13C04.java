import java.util.Scanner;

public class Question13C04 {
    public static void main(String[] args) {
        char letter;
        String LETTER;
        System.out.print("\nEnter a letter : ");
        try(Scanner getLetter = new Scanner(System.in)){
            LETTER = getLetter.next().toUpperCase();
            letter = LETTER.charAt(0);
        }
        if((int)letter == 65 || (int)letter == 69 || (int)letter == 73 || (int)letter == 79 ||  (int)letter == 85){
            System.out.println("\n" + letter + " is vowel\n");
        }else if ((int)letter > 65 && (int)letter <= 90){
            System.out.println("\n" + letter + " is consonant\n");
        }else{
            System.out.println("\n" +  letter + " is an invalid input\n");
        }
    }
}
