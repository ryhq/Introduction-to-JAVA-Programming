import java.util.Scanner;

public class Question19C06 {
    public static boolean isValid(double side1, double side2, double side3){
        boolean isValid = false;
        if (
            (side1 + side2) >= side3 &&
            (side3 + side2) >= side1 &&
            (side1 + side3) >= side2
        ) {
            isValid = true;
        }
        return isValid;
    }
    public static double area(double side1, double side2, double side3){
        double S = ( side1 + side2 + side3 ) / 2;
        double area = Math.pow(( S * ( S - side1 ) * ( S - side2 ) * ( S - side3 ) ), 0.5);
        return area;
    }
    public static void main(String[] args) {
        try(Scanner getSides = new Scanner(System.in)){
            System.out.print("\nEnter three sides of the triangle : ");
            double side1 = getSides.nextDouble();
            double side2 = getSides.nextDouble();
            double side3 = getSides.nextDouble();
            if (isValid(side1, side2, side3)) {
                System.out.println("\nArea of the triangle is : " + area(side1, side2, side3) + "\n");
            }else{
                System.out.println("\nInput is invalid\n");
            }
        }
    }
}
