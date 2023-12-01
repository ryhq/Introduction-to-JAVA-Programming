public class Question27C06 {
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
    public static void emirp() {
        int emirpLimit = 0;
        for (int i = 0; ; i++) {
            if (emirpLimit == 100) { // Breaking loop after 100 emirps
                break;
            }
            if (isPrime(i)) { // Checking prime numbers
                int reverse = reverse(i); // Reversing the prime number
                if (isPrime(reverse) && isPalindrome(reverse) == false) { // Checking the reverse number if its prime number and MUST NOT be PALINDROME
                    System.out.printf("%10d", reverse);
                    emirpLimit++;
                    if (emirpLimit % 10 == 0) {
                        System.out.println("\n");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("\nAn emirp (prime spelled backward) is a nonpalindromic prime number whose reversal is also a prime.\n\nHere are first 100 emirp prime integers\n");
        emirp();
        System.out.println("\n");
    }
}
