import java.util.Scanner;

public class Question19C04 {
    public static void main(String[] args) {
        int isbn, checksum = 0;
        String ISBN;
        try(Scanner getISBN = new Scanner(System.in)){
            System.out.print("\nEnter the first 9 digits of an ISBN as integer : ");
            ISBN = getISBN.next();
        }
        isbn = Integer.parseInt(ISBN);
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
