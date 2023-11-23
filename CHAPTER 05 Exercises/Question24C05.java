public class Question24C05 {
    public static void main(String[] args) {
        System.out.println();
        double sum = 0;
        for (int i = 1; i <= 97; i += 2) {
            System.out.print(" + " + i + " / " + (i + 2));
            sum += i / ( i + 2.0);
        }
        System.out.printf(" =  %.2f", sum);
        System.out.println();
        System.out.println();
    }
}
