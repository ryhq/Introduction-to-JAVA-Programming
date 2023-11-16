import java.util.Scanner;

public class Question21C04 {
    public static void main(String[] args) {
        String SSN;
        System.out.print("\nEnter your SSN (DDD-DD-DDDD) : ");
        try(Scanner getSSN = new Scanner(System.in)){
            SSN = getSSN.next();
        }
        if (SSN.charAt(3) == '-' && SSN.charAt(6) == '-' && SSN.length() == 11) {
            System.out.println("\n" + SSN + " is an valid social security number\n");
        }else{
            System.out.println("\n" + SSN + " is a invalid social security number\n");
        }
    }
}
