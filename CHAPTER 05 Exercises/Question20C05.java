public class Question20C05 {
    public static void main(String[] args) {
        int count = 0, rowMaker = 0;
        System.out.println();
        for (int i = 2; i <= 1000; i++) {
            for (int j = i; j >= 1; j--) {
                if (i % j == 0 ) {
                    count++;
                }
            }
            if (count == 2) {
                rowMaker++;
                System.out.printf("%5d", i);
                if (rowMaker % 8 == 0) {
                    System.out.println();
                }
            }
            count = 0;
        }
        System.out.println();
    }
}
