import java.util.Scanner;

public class Question23C02 {
    public static void main(String[] args) {
        double distance, milesPerGallon, pricePerGallon;
        try(Scanner getData = new Scanner(System.in)){
            System.out.print("\nEnter the driving distance : ");
            distance = getData.nextDouble();
            System.out.print("\nEnter miles per gallon : ");
            milesPerGallon = getData.nextDouble();
            System.out.print("\nEnter price per gallon : ");
            pricePerGallon = getData.nextDouble();
        }
        System.out.println("\nThe cost of driving is : $" + ( distance / milesPerGallon ) * pricePerGallon + "\n");
    }
}
