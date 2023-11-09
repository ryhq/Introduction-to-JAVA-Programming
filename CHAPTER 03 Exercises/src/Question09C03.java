import java.util.Scanner;

public class Question09C03 {
    public static void main(String[] args) {
        int ISBN, isbn, checksum = 0;
        try(Scanner getISBN = new Scanner(System.in)){
            System.out.print("\nEnter the first 9 digits of an ISBN as integer : ");
            ISBN = getISBN.nextInt();
        }
        isbn = ISBN;
        if( isbn > 999999999 ){
            System.out.println("\nPlease follow instruction\n");
        } else {
            for (int i = 9; i >= 1; i--) {
                checksum = checksum + (isbn % 10);
                isbn = isbn / 10;
            }
            checksum = checksum % 11;
            if (checksum == 10) {
                System.out.println("\nThe ISBN-10 number is : 0" + ISBN + "X\n");
            }else{
                System.out.println("\nThe ISBN-10 number is : 0" + ISBN + checksum + "\n");
            }
        }
    }
}
