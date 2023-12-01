import java.util.Scanner;

public class Question17C06 {
    public static void printMatrix(int n){
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", Math.round((0 + (Math.random() * 1))));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try(Scanner getn = new Scanner(System.in)){
            System.out.print("\nEnter value of n for ñ x ñ : ");
            int n = getn.nextInt();
            while (n < 2) {
                System.out.print("\nEnter value of n for ñ x ñ : ");     
                n = getn.nextInt();           
            }
            printMatrix(n);
            System.out.println();
        }
    }
}
