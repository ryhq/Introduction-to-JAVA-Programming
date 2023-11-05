import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        double subTotal, gratuityRate, total;
        try (Scanner getData = new Scanner(System.in)) {
            System.out.print("\nEnter Sub-Total : ");
            subTotal = getData.nextDouble();
            System.out.print("\nEnter Gratuity rate : ");
            gratuityRate = getData.nextDouble();
        }
        total = subTotal + ( subTotal * ( gratuityRate / 100 ) );
        System.out.println("\nThe gratuity rate is " + gratuityRate / 100 + " and total is " + total + "\n");
    }
}
