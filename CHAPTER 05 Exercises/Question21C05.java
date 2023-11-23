import java.util.Scanner;

public class Question21C05 {
    public static void main(String[] args) {
        double amount, years;
        System.out.print("\nLoan Amount : ");
        try(Scanner getData = new Scanner(System.in)){
            amount = getData.nextDouble();
            if (amount <= 0) {
                System.out.println("\nLoan Amount Can't be 0 or negative!!!");
            }else{
                System.out.print("\nNumber of Years : ");
                years = getData.nextInt();
                if (years <= 0) {
                    System.out.println("\n\nNumber of years can't be accepted!!!\n");
                }else{
                    System.out.println("Interest Rate   Monthly Rate   Total Payment");
                    for (double i = 5.0; i <= 8.0; i = i + (1/8.0)) {
                        System.out.printf("%8.3f%18.2f%16.2f", i, ((i / 100) * amount), ((i / 100) * amount + amount));
                        System.out.println();
                    }
                }
            }
        }
        System.out.println();
    }
}
