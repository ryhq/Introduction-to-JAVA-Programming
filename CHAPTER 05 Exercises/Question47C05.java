import java.util.Scanner;

public class Question47C05 {
    public static void main(String[] args) {
        String ISBN13;
        try(Scanner getISBN = new Scanner(System.in)){
            System.out.print("\nEnter the first 12 digits of an ISBN-13 as a string : ");
            ISBN13 = getISBN.next();
            while (ISBN13.length() == 0) {
                System.out.print("\nEnter the first 12 digits of an ISBN-13 as a string : ");
                ISBN13 = getISBN.next();                
            }
            if (ISBN13.length() != 12) {
                System.out.println("\n" + ISBN13.length() + " characters to ISBN are not allowed!!!\n");
            }else{
                int  ISBNLength = ISBN13.length(), ISBNCheckSum = 0;
                for (int i = 0; i < ISBNLength; i++) {
                    int ISBNChar = Character.getNumericValue(ISBN13.charAt(i)); // ISBNChar holds one character of ISBN13 one at a time each time in the loop
                    if (i % 2 != 0) {
                        ISBNCheckSum += 3 * ISBNChar;
                    }else{
                        ISBNCheckSum += ISBNChar;
                    }
                }
                ISBNCheckSum = 10 - (ISBNCheckSum % 10);
                System.out.print("\nThe ISBN-13 number is : " + ISBN13);
                if (ISBNCheckSum == 10) {
                    System.out.println(0 + "\n");
                }else{
                    System.out.println(ISBNCheckSum + "\n");
                }
            }
        }
    }
}
