import java.util.Scanner;

public class Question18C06 {
    public static void passwordVerifier(String password) {
        if (password.length() < 8) {
            System.out.println("\nA password must have at least eight characters.\n");
        }
        if (password.length() >= 8) {
            char character; // holds single character per time of the password
            int totalDigitsPassword = 0; // Total number of digits in the password
            boolean containSpecialCharacters = false;
            for (int i = 0; i < password.length(); i++) {
                character = password.charAt(i);
                if (((int)character) >= 48 && ((int)character) <= 57) {
                    totalDigitsPassword++;
                }
                if (
                    (((int)character) >= 33 && ((int)character) <= 47) && 
                    (((int)character) <= 58 && ((int)character) <= 64) &&
                    (((int)character) <= 91 && ((int)character) <= 96) &&
                    (((int)character) <= 123 && ((int)character) <= 126)
                    )  {
                    containSpecialCharacters = true;
                }
            }
            if (totalDigitsPassword < 2) {
                System.out.println("\nA password must contain at least two digits.\n");
            }
            if (containSpecialCharacters) {
                System.out.println("\nA password consists of only letters and digits.\n");
            }
        }
    }
    public static void main(String[] args) {
        try(Scanner getPassword = new Scanner(System.in)){
            System.out.print("\nEnter your password (without white-space) : ");
            String password = getPassword.next();
            passwordVerifier(password);
        }
    }
}
