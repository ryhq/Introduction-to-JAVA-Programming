public class Question26C05 {
    public static void main(String[] args) {
        for (int a = 1; a <= 100000; a += 10000) {
            double inverseFactorial = 0;
            for (int i = 1; i <= a; i++) {
                long factorial = 1;
                for (int j = i; j >= 1; j--) {
                    factorial *= j;
                }
                inverseFactorial += Math.pow(factorial, -1);
            }
            System.out.printf("%d%16.3f", a, inverseFactorial);
            System.out.println("\n");
        }
    }
}
