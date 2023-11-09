import java.util.Scanner;

public class Question03C03 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        System.out.println("\n2 x 2 linear Equation can be formatted as : \n\nax + by = e\ncx + dy = f\n ");
        System.out.print("Enter the coefficient values for a, b, c, d, e, f : ");
        try( Scanner getCoefficient = new Scanner(System.in)){
            a = getCoefficient.nextDouble();
            b = getCoefficient.nextDouble();
            c = getCoefficient.nextDouble();
            d = getCoefficient.nextDouble();
            e = getCoefficient.nextDouble();
            f = getCoefficient.nextDouble();
        }
        if ((a * d - b * c) == 0) {
            System.out.println("\nThe equation has no solution.\n");
        } else {
            x = (( e * d ) - ( b * f )) / (( a * d ) - ( b * c ));
            y = (( a * f ) - ( e * c )) / (( a * d ) - ( b * c ));
            System.out.println("\nx is " + x + " and y is " + y + "\n");         
        }
    }
}
