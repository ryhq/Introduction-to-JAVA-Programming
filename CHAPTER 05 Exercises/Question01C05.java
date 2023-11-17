import java.util.Scanner;

public class Question01C05 {
    public static void main(String[] args) {
        int number, totalPositives = 0, positiveSum = 0, totalNegatives = 0, negatvieSum = 0;
        System.out.print("\nEnter an integer, the input ends if it is 0 : ");
        try(Scanner getNumber = new Scanner(System.in)){
            number = getNumber.nextInt();
            while (number != 0) {
                if (number > 0) {
                    totalPositives++;
                    positiveSum += number;
                }else{
                    totalNegatives++;
                    negatvieSum += number;
                }
                System.out.print("\nEnter an integer, the input ends if it is 0 : ");
                number = getNumber.nextInt();
            }if (positiveSum == 0 && negatvieSum == 0) {
                System.out.println("\nNo numbers are entered except 0\n");
            }else{
                System.out.println("\n\nThe number of positives is " + positiveSum);
                System.out.println("\nThe number of negatives is " + negatvieSum);
                System.out.println("\nThe total is " + (positiveSum + negatvieSum));
                System.out.println("\nThe average is " + ((positiveSum + negatvieSum) / (totalPositives + totalNegatives)) + "\n");
            }
        }
    }
}
