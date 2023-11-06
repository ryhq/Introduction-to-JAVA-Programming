import java.util.Scanner;

public class Question13C02 {
    public static void main(String[] args) {
        double accountBalance = 0, savingAmount;
        final double ANNUAL_RATE = 0.05;
        final double MONTHLY_RATE = ANNUAL_RATE / 12.0;
        try( Scanner getSavingAmount = new Scanner(System.in) ){
            System.out.print("\nEnter the monthly saving amount : ");
            savingAmount = getSavingAmount.nextDouble();
        }
        for (int i = 1; i < 7; i++) {
            accountBalance = savingAmount + accountBalance * (1 + MONTHLY_RATE);
        }
        System.out.println("\nAfter the sixth month, the account value is : " + accountBalance + "\n");
    }
}
