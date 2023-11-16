import java.util.Scanner;

public class Question22C04 {
    public static void main(String[] args) {
        try(Scanner getString = new Scanner(System.in)){
            System.out.print("\nEnter string one : ");
            String stringOne = getString.next();
            System.out.print("\nEnter string one : ");
            String stringTwo = getString.next();
            if (stringOne.contains(stringTwo)) {
                System.out.println("\n" + stringTwo + " is a substring of " + stringOne + "\n");
            }else{
                System.out.println("\n" + stringTwo + " is not a substring of " + stringOne + "\n");
            }
        }
    }
}
