import java.util.Scanner;

public class Question17C05 {
    public static void main(String[] args) {
        int lines;
        System.out.print("\nEnter the number of lines : ");
        try(Scanner getLines = new Scanner(System.in)){
            lines = getLines.nextInt();
        }
        if (lines < 0) {
            System.out.println("\nLines cannot be less than 0\n");
        }else{
            System.out.println();
            for (int i = 1; i <= lines; i++) {
                for (int j = 1; j <= lines - i; j++) {
                    System.out.print("   ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.printf("%3d", k);
                }
                for (int j = 2; j <= i; j++) {
                    System.out.printf("%3d", j);
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
