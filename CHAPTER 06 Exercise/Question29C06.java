public class Question29C06 {
    /*
     * A method to check of the number is prime number
     */
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void twinPrimes() {
        for (int i = 1; i <= 1000; i++) {
            int prime = isPrime(i) ? i : 2;
            if (isPrime((prime + 2))) {
                System.out.println("\n(" + prime + ", " + (prime + 2) + ")");
            }
        }
    }
    public static void main(String[] args) {
        twinPrimes();
        System.out.println();
    }
}
