import java.util.Scanner;

public class Question18C04 {
    public static void main(String[] args) {
        String characters, major = "", status = "";
        System.out.print("\nEnter two characters : ");
        try(Scanner getCharacter = new Scanner(System.in)){
            characters = getCharacter.next().toUpperCase();
            if ((int)characters.charAt(0) >= 65 && (int)characters.charAt(0) <= 90 ) {
                switch (characters.charAt(0)) {
                    case 'M':
                        major = "Mathematics";
                        break;
                    case 'C':
                        major = "Computer Science";
                        break;
                    case 'I':
                        major = "Information Technology";
                        break;                
                    default:
                        System.out.println("\n" + characters.charAt(0) + " is unknown input\n");
                        break;
                }
                switch ((characters.charAt(1))) {
                    case '1':
                        status = "freshman";
                        break;
                    case '2':
                        status = "sophomore";
                        break;
                    case '3':
                        status = "junior";
                        break;
                    case '4':
                        status = "senior";
                        break;
                
                    default:
                        System.out.println("\nUnknown Status!!!\n");
                        break;
                }
            } else { 
                System.out.println("\nAlphabetical letter are only allowed!!!\n");
            }
            if (major.length() != 0 && status.length() != 0) {
                System.out.println("\n" + major + " " + status + "\n");
            }
        }
    }
}
