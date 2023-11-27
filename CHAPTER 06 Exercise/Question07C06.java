import java.util.Scanner;

public class Question07C06 {
    public static double futureInvestmentValue(
        double investmentAmount, 
        double monthlyInterestRate, 
        int years) {
            return investmentAmount * Math.pow(( 1 + ( monthlyInterestRate / 100 ) / 12 ), (years * 12));
    }
    public static void main(String[] args) {
        try(Scanner getData = new Scanner(System.in)){
            System.out.print("\nThe amount invested : ");
            double investmentAmount = getData.nextDouble();
            while (investmentAmount <= 0) {
                System.out.println("\nInvestment Amount can\'t be zero or negative!\n");
                System.out.print("\nThe amount invested : ");
                investmentAmount = getData.nextDouble();                
            }
            System.out.print("\nAnnual interest rate : ");
            double annualRate = getData.nextDouble();
            while (annualRate <= 0) {
                System.out.print("\nAnnual Rate cannot be zero or less than zero\n\nAnnual interest rate : ");
                annualRate = getData.nextDouble();                
            }
            System.out.println("\nYears\tFuture Value\n");
            for (int i = 1; i <= 30; i++) {
                System.out.printf("%3d \t %10.2f", i, futureInvestmentValue(investmentAmount, annualRate/12, i));
                System.out.println();
            }
            System.out.println("\n");
        }
    }
}
