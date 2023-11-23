import java.util.Scanner;

public class Question45C05 {
    public static void main(String[] args) {
        double number, sumNumbers = 0, numberSquareSum = 0;
        try(Scanner getNumbers = new Scanner(System.in)){
            for (int i = 1; i <= 10; i++) {
                System.out.print("\nEnter number " + i + " : ");
                number = getNumbers.nextDouble();
                numberSquareSum += Math.pow(number, 2.0);
                sumNumbers += number;
            }
            double mean = sumNumbers / 10.0;
            double standardDeviation = Math.pow(((numberSquareSum - ((sumNumbers * sumNumbers) / 10)) / 9), 0.5);
            System.out.println("\n\nThe mean is " + mean);
            System.out.println("\nThe standard deviation is " + standardDeviation + "\n");
        }
    }
}
