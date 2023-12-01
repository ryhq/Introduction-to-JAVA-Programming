public class Question26C06 {

    /*
     * A method to reverse a number
     */
    public static int reverse(int number) {
        int reverse = 0;
        int theNumber = number;
        int times = 1;
        for (
                int i = 1; 
                i < String.valueOf(number).length(); // Determining the length of number
                i++
            ) {
            times *= 10;
        }
        while (theNumber != 0) {
            reverse += (theNumber % 10) * times;
            theNumber = theNumber / 10;
            times /= 10;
        }
        return reverse;
    }
    /*
     * A method to check the number if is palindrome
     */
    public static boolean isPalindrome(int number) {
        boolean palindrome = false;
        if (reverse(number) == number) {
            palindrome = true;
        }
        return palindrome;
    }
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
    public static void palindromicPrime() {
        int palindromicPrimeLimit = 0;
        for (int i = 0; ; i++) {
            if (palindromicPrimeLimit == 100) { // Breaking loop after 100 palindrome prime numbers
                break;
            }
            if (isPrime(i) && isPalindrome(i)) {
                System.out.printf("%10d", i);
                palindromicPrimeLimit++;
                if (palindromicPrimeLimit % 10 == 0) {
                    System.out.println(""); // Print next line after ten palindrome prime numbers
                }                
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("\nA palindromic prime is a prime number and also palindromic\n\nHere are first 100 palindromic prime integers\n");
        palindromicPrime();
        System.out.println("\n");
    }
}
