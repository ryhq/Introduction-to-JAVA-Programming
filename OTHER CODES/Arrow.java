import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        int lines;
        System.out.print("\nEnter the number of lines for a arrow: ");
        try(Scanner getLines = new Scanner(System.in)){
            lines = getLines.nextInt();
        }
        if (lines < 10) {
            System.out.println("\nLines cannot be less than 10\n");
        }else{
            System.out.println();
            for (int i = 1; i <= lines; i++) {
                for (int j = 1; j <= lines - i; j++) {
                    System.out.print("   ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.printf("%3c", '^');
                }
                for (int j = 2; j <= i; j++) {
                    System.out.printf("%3c", '^');
                }
                System.out.println();
            }
            for (int a = 0; a <= (lines); a++) {
                for (int i = 1; i <= (lines - 10 + 1) * 3; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 17; i++) {
                    System.out.print("  ^");
                }
                System.out.println();
            }
        }
    }
}
