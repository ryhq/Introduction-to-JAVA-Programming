
public class Question01C06 {
    public static int getPentagonalNumber(int number) {
        return number * ( 3 * number - 1 ) / 2;
    }
    public static void main(String[] args) {
        int number = 1 ;
        System.out.println();
        while (number != 100) {
            System.out.printf("%7d", getPentagonalNumber(number));
            if (number % 10 == 0) {
                System.out.println();
            }
            number++;
        }
        System.out.println("\n");
    }
}
