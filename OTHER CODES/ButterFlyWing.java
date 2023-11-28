public class ButterFlyWing {
    public static void main(String[] args) {
        System.out.println("\nBUTTERFLY WING");
        int c = 25;
        System.out.println("\n\n\n\n\n");
        for (int i = 1; i <= 25; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" %" + c + "s", "<>");
            }
            System.out.println();
            c--;
        }
        int b = 25;
        System.out.println("\n\n\n\n\n");
        for (int i = 1; i <= 25; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" %" + b + "s", "<*>");
            }
            if (i == 22) {
                break;
            }
            System.out.println();
            b--;
        }
    }
}