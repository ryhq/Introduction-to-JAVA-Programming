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
        // System.out.println("\nPATTERN B");
        // for (int i = 6; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.println(" " + j);
        //     }
        // }
        // System.out.println();
    }
}
