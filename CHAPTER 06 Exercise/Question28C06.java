public class Question28C06 {
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
    public static void mersennePrime() {
        System.out.println("\n    No    P           (2^P) - 1");
        int mersennePrimeLimit = 0;
        for (int i = 1; ; i++) {
            if (mersennePrimeLimit == 31) {
                break;
            }
            if (
                isPrime(
                    ((int)Math.pow(2, i)) - 1
                )
            ) {
                mersennePrimeLimit++;
                System.out.printf("\n%5d %5d %15d", mersennePrimeLimit, i, (((int)Math.pow(2.0, i)) - 1));
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        mersennePrime();
    }
    
}
