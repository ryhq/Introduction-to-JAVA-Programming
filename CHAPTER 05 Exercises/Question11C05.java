public class Question11C05 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println();
        for (int i = 100; i <= 200; i++) {
            if (i == 100) {
                continue;
            }
            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;
                System.out.printf(" %3d", i);
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
