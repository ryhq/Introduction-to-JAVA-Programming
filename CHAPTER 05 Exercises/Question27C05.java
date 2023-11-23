public class Question27C05 {
    public static void main(String[] args) {
        System.out.println("\nLeap years, ten per line, from 101 to 2100\n");
        int isLeap = 0;
        for (int i = 101; i <= 2100; i++) {
            if (i % 4 == 0) {
                isLeap++;
                System.out.printf("%5d", i);
                if (isLeap % 8 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n");
    }
}
