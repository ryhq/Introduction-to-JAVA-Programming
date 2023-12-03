import java.util.Scanner;

public class Question31C06 {
    public static int secondDigit(long creditCardNumber) {
        String theCreditCardNumber = Long.toString(creditCardNumber); // Converting to string
        int position = theCreditCardNumber.length() - 2; // Holding the even position from right to left
        int sumSecondDigit = 0;
        for (int i = theCreditCardNumber.length() - 1; i >= 0; i = i - 2) {
            /*
             * Converting each string integer to integer 
             */
            int theDigit = Integer.parseInt( // Converts strings to integer
                String.valueOf( // Converts single charater to string
                    theCreditCardNumber.charAt( // Getting the character at its position
                        position
                    )
                )
            );
            /*
             *  The above code is similar to "int theDigit = Integer.parseInt(String.valueOf(theCreditCardNumber.charAt(position)));"
             */

            /*
             * Double every second digit from right to left
             */
            theDigit *= 2;
            if (theDigit >= 10) {
                theDigit = 1 + (theDigit % 10); // Because not number times two is greater than 20, we must add number
            }
            sumSecondDigit += theDigit;
            position -= 2;
        }
        return sumSecondDigit;
    }
    public static int oddPalacesDigit(long creditCardNumber) {
        String theCreditCardNumber = Long.toString(creditCardNumber);
        int position = theCreditCardNumber.length() - 1;
        int sumOddDigits = 0;
        for (int i = theCreditCardNumber.length() - 1; i >= 0; i = i - 2) {
            int theDigit = Integer.parseInt(String.valueOf(theCreditCardNumber.charAt(position)));
            sumOddDigits += theDigit;
            position -= 2;
        }
        return sumOddDigits;
    }
    public static boolean creditCardNumberValidation(long creditCardNumber) {
        boolean isValid = true;
        if (
            (secondDigit(creditCardNumber) + oddPalacesDigit(creditCardNumber)) % 10 != 0
        ) {
            isValid = false;
        }
        return isValid;
    }
    public static void main(String[] args) {
        try(Scanner getCreditCardNumber = new Scanner(System.in)){
            System.out.print("\nEnter a credit card number as a long integer : ");
            long creditCardNumber = getCreditCardNumber.nextLong();
            if (creditCardNumberValidation(creditCardNumber)) {
                System.out.println("\n" + creditCardNumber + " is valid");
            }else{
                System.out.println("\n" + creditCardNumber + " is not valid");
            }
        }
        System.out.println("");
    }
}
