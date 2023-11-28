import java.util.Scanner;

public class PasswordGenerator {
    // Method to generate random characters
    public static char characterGenerator(int from, int to) {
        return (char) (int) (from + Math.random() * to);
    }

    public static String passwordGenerator(int passwordType, int passwordLength) {
        String password = "";
        switch (passwordType) {
            case 1: // CAPITAL Letter Password
                for (int i = 1; i <= passwordLength; i++) {
                    password += characterGenerator(65, (90 - 65));
                }
                break;
            case 2: // LowerCase Letter Password
                for (int i = 1; i <= passwordLength; i++) {
                    password += characterGenerator(97, (122 - 97));
                }
                break;
            case 3: // Number Password
                for (int i = 1; i <= passwordLength; i++) {
                    password += characterGenerator(48, (57 - 48));
                }
                break;
            case 4: // UpperCase and LowerCase Password
                for (int i = 1; i <= passwordLength; i++) {
                    password += characterGenerator(65, (122 - 65));
                }
                break;
            case 5: // Mixed Character Password
                for (int i = 1; i <= passwordLength; i++) {
                    password += characterGenerator(33, (126 - 33));
                }
                break;
        
            default:
                break;
        }
        return password;
    }
    public static void main(String[] args) {
        int passwordType, passwordLength;
        System.out.println("\nWelcome to Ryhq technologies!!!\n");
        System.out.println("Press;\n\t01. CAPITAL Letter Password\n\t02. LowerCase Letter Password\n\t03. Number PassCode\n\t04. UpperCase and LowerCase Password\n\t05. Mixed Character Password");
        System.out.print("\nType Here : ");
        try(Scanner getChoice = new  Scanner(System.in)){
            passwordType = getChoice.nextInt();
            while (
                    passwordType != 1 && 
                    passwordType != 2 &&
                    passwordType != 3 &&
                    passwordType != 4 &&
                    passwordType != 5
                ) {
                    System.out.println("\nIncorrect choice\n");
                    System.out.print("Type Here : ");
                    passwordType = getChoice.nextInt();
            }
            System.out.print("\nEnter password\'s length : ");
            passwordLength = getChoice.nextInt();
            while (passwordLength < 6) {
                System.out.println("\nDue to security reasons, password with " + passwordLength + " character length are highly not recommended");
                System.out.print("\nEnter password\'s length : ");
                passwordLength = getChoice.nextInt();
            }
            System.out.println("\nPassword : " + passwordGenerator(passwordType, passwordLength) + "\n");
        }
    }
}
