import java.util.Scanner;

public class Question01C03 {
    public static void main(String[] args) {
        double a, b, c, r1, r2, discriminant;
        try(Scanner getCoefficient = new Scanner(System.in)){
            System.out.print("\nEnter the coefficient's values for a, b, c : ");
            a = getCoefficient.nextDouble();            
            b = getCoefficient.nextDouble();
            c = getCoefficient.nextDouble();
        }
        discriminant = ( Math.pow( b, 2.0 ) - ( 4 * a * c ) );
        if ( discriminant > 0 ) {
            r1 = (( -1 * b ) + Math.pow(discriminant, 0.5)) / 2 * a;
            r2 = (( -1 * b ) - Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("\nThe equation has two roots " + r1 + " and " + r2 + "\n");
        } else if ( discriminant == 0 ) {
            r2 = (( -1 * b ) - Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("\nThe equation has one root " + r2 + "\n");
        } else{
            System.out.println("\nThe equation has no real roots\n");
        }
    }
}
