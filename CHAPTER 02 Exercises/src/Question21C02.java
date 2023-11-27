import java.util.Scanner;

public class Question21C02 {
    public static void main(String[] args) {
        double investimentAmount, annualRate, years, futureInvestmentValue;
        try(Scanner getData = new Scanner(System.in)){
            System.out.print("\nEnter investiment Amount : ");
            investimentAmount = getData.nextDouble();
            System.out.print("\nEnter annual interest rate in percentage : ");
            annualRate = getData.nextDouble();
            System.out.print("\nEnter number of years : ");
            years = getData.nextDouble();
        }
        futureInvestmentValue = investimentAmount * Math.pow(( 1 + ( annualRate / 100 ) / 12 ), (years * 12));
        System.out.println("\nAccumulated Value : " + futureInvestmentValue + "\n");
    }
}
