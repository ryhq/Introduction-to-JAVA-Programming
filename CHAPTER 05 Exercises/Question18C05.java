public class Question18C05 {
    public static void main(String[] args) {
        System.out.println("\nPATTERN A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\nPATTERN B");
        int x = 6;
        while (x != 0) {
            for (int i = 1; i <= x; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
            x--;
        }
        System.out.println();
        System.out.println("\nPATTERN C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print("  " );
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\nPATTERN D");
        int r = 6;
        while (r != 0) {
            for (int j = 1; j <= 6-r; j++) {
                System.out.print("  " );
            }
            for (int i = 1; i <= r; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
            r--;
        }
        System.out.println();
        System.out.println("\nPATTERN E");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(" " );
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\nPATTERN D");
        int e = 6;
        while (e != 0) {
            for (int j = 1; j <= 6-e; j++) {
                System.out.print(" " );
            }
            for (int i = 1; i <= e; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
            e--;
        }
    }
}
