import java.util.Scanner;

public class Question23C04 {
    public static void main(String[] args) {
        try(Scanner getData = new Scanner(System.in)){
            System.out.print("\nEnter employee's name : ");
            String name = getData.nextLine();
            System.out.print("\nEnter number of hours worked in a week : ");
            int hour = getData.nextInt();
            System.out.print("\nEnter hourly pay rate : ");
            double rate = getData.nextDouble();
            System.out.print("\nEnter federal tax withholding rate : ");
            double federalTaxRate = getData.nextDouble();
            System.out.print("\nEnter state tax withholding rate : ");
            double stateTaxRate = getData.nextDouble();
            System.out.println("\nEmployee Name : " + name);
            System.out.println("\nHours Worked : " + hour);
            System.out.println("\nPay Rate : " + rate);
            System.out.println("\nGross Pay : " + (rate * hour));
            System.out.println("\nDeduction : ");
            System.out.println("\nFederal Withholding (20.0%) : " + (rate * hour) * federalTaxRate);
            System.out.println("\nState Withholding (9.0%) : " + (rate * hour) * stateTaxRate);
            System.out.println("\nTotal Deduction : " + ((rate * hour) * federalTaxRate + (rate * hour) * stateTaxRate));
            System.out.println("\nNet Pay : " + ((rate * hour) - ((rate * hour) * federalTaxRate + (rate * hour) * stateTaxRate)) + "\n");
        }
    }
}