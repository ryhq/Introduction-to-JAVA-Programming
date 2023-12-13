import java.util.Scanner;
public class Question02C07 {
    public static void main(String[] args) {
        int [] integer = new int[10];
        try (Scanner getInteger = new Scanner(System.in)) {
            for (int i = 0; i < integer.length; i++) {
                System.out.print("\nEnter integer " + (i + 1) + " : ");
                integer[i] = getInteger.nextInt();
            }
        }
        for (int i = integer.length - 1; i >= 0; i--) {
            System.out.print(" " + integer[i]);
        }
        System.out.println();
    }
}
