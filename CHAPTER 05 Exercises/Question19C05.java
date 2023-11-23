public class Question19C05 {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12 - i; j++) {
                System.out.print("     ");
            }
            int x = 1;  
            for (int k = 1; k <= i; k++) {
                System.out.printf(" %4d", x);
                x *= 2;
            }
            x = x / 2;
            for (int k = 1; k < i; k++) {
                x = x / 2;
                System.out.printf(" %4d", x);
            }
            System.out.println();
        }
        System.out.println();
    }
}
