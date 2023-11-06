import java.util.Scanner;

public class Question20C02 {
    public static void main(String[] args) {
        double balance, annualRate;
        try( Scanner getData = new Scanner(System.in)){
            System.out.print("\nEnter the balance : ");
            balance = getData.nextDouble();
            System.out.print("\nEnter annual interest rate in percentage : ");
            annualRate = getData.nextDouble();
        }
        System.out.println("\nThe interest is : " + balance * ( annualRate / 1200) + "\n");
    }
}
