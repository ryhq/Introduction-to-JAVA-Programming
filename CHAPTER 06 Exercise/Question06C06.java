import java.util.Scanner;

public class Question06C06 {
    public static void displayPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("  " );
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try(Scanner getRow = new Scanner(System.in)){
            System.out.print("\nEnter a number or rows :");
            int rows = getRow.nextInt();
            while (rows <= 0) {
                System.out.print("\nEnter a number or rows :");
                rows = getRow.nextInt();                
            }
            System.out.println();
            displayPattern(rows);
            System.out.println();
        }
    }
}
