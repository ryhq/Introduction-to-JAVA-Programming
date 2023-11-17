public class Question03C05 {
    public static void main(String[] args) {
        System.out.println("\nKilogram\tPounds");
        for (int i = 1; i < 200; i++) {
            System.out.printf("%3d\t\t%3.3f", i, (i * 2.2));
            System.out.println();
        }
        System.out.println("\n");
    }
}
