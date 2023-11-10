import java.util.Scanner;

public class Question18C03 {
    public static void main(String[] args) {
        double weight;
        System.out.print("\nEnter the weight of the package : ");
        try(Scanner getWeight = new Scanner(System.in)){
            weight = getWeight.nextDouble();
        }
        if (weight > 0 && weight <= 1) {
            System.out.println("\nShipping cost of " + weight + " pounds is $3.5/=\n" );
        } else if (weight > 1 && weight <= 3) {
            System.out.println("\nShipping cost of " + weight + " pounds is $5.5/=\n" );
        } else if (weight > 3 && weight <= 10) {
            System.out.println("\nShipping cost of " + weight + " pounds is $8.5/=\n" );
        } else if (weight > 10 && weight <= 20) {
            System.out.println("\nShipping cost of " + weight + " pounds is $10.5/=\n" );
        }else{
            System.out.println("\nThe package cannot be shipped.\n");
        }
    }
}
