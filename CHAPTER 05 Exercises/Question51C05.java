import java.util.Scanner;

public class Question51C05 {
    public static void main(String[] args) {
        String stringOne, stringTwo;
        try(Scanner getString = new Scanner(System.in)){
            System.out.print("\nEnter string one : ");
            stringOne = getString.nextLine();
            while (stringOne.length() <= 0) {
                System.out.print("\nEnter string one : ");
                stringOne = getString.nextLine();
            }
            System.out.print("\nEnter string two : ");
            stringTwo = getString.nextLine();
            while (stringTwo.length() <= 0) {
                System.out.print("\nEnter string two : ");
                stringTwo = getString.nextLine();                
            }
            if (stringOne.length() > 0 && stringTwo.length() > 0) {
                int shortestStringCharacters = Math.min(stringOne.length(), stringTwo.length());
                String prefixString = "";
                for (int i = 0; i < shortestStringCharacters; i++) {
                    if (stringOne.charAt(i) == stringTwo.charAt(i)) {
                        prefixString += stringOne.charAt(i);
                    }
                }
                if (prefixString.length() <= 0) {
                    System.out.println("\n" + stringOne + " and " + stringTwo + " have no common prefix \n");
                }else if (prefixString.length() > 0) {
                    System.out.println("\nThe common prefix is " + prefixString + "\n");
                }
            }
        }
    }
}
