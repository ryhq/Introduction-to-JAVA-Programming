public class Question25C05 {
    public static void main(String[] args) {
        double PI = 0;
        System.out.println("\nValue for i   |    PI value");
        for (int j = 10000; j <= 100000; j += 10000) {
            for (int i = 3; i <= j; i += 2) {
                PI = Math.pow((-1), (i + 1.0)) / (2.0 * i - 1);
            }
            PI = 4 * ( 1 - PI);
            System.out.printf("\n%8d      |%12.7f", j, PI);
        }
        System.out.println("\n");
    }
}
