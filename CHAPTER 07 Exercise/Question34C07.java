import java.util.Scanner;
public class Question34C07 {

    public static String sort(String string){
        /* Converting string to lowercase */
        string  = string.toLowerCase();
        String sorted = "";
        /* Creating an array */
        char[] stringArray = new char[string.length()];
        /* Storing each character in an array */
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = string.charAt(i);
        }
        /* Sorting characters */
        for (int i = 97; i <= 122; i++) {
            for (char character : stringArray) {
                if (i == (int) character) {
                    sorted += character;
                }
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        try(Scanner getString = new Scanner(System.in)){
            System.out.print("\nType in a string : ");
            String userString = getString.nextLine();
            System.out.println("\nSorted string is : " + sort(userString) + "\n");
        }
    }
}
