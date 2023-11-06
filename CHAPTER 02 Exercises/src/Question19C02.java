import java.util.Scanner;

public class Question19C02 {
    public static double getDistanceBetweenTwoPoints(double a1, double b1, double a2, double b2) {
        return  Math.pow( ( Math.pow(( a2 - a1 ), 2.0) + Math.pow(( b2 - b1 ), 2.0) ), 0.5 );
    }
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, side1, side2, side3, S, area;
        try(Scanner getTrianglePoints = new Scanner(System.in)){
            System.out.print("\nEnter three points for a triangle as x1 y1 x2 y2 x3 y3 : ");
            x1 = getTrianglePoints.nextDouble();
            y1 = getTrianglePoints.nextDouble();
            x2 = getTrianglePoints.nextDouble();
            y2 = getTrianglePoints.nextDouble();
            x3 = getTrianglePoints.nextDouble();
            y3 = getTrianglePoints.nextDouble();
        }
        side1 = getDistanceBetweenTwoPoints(x1, y1, x2, y2);
        side2 = getDistanceBetweenTwoPoints(x2, y2, x3, y3);
        side3 = getDistanceBetweenTwoPoints(x3, y3, x1, y1);
        S = ( side1 + side2 + side3 ) / 2;
        area = Math.pow(( S * ( S - side1 ) * ( S - side2 ) * ( S - side3 ) ), 0.5);
        System.out.println("\nThe area of the triangle is : " + area + "\n");
    }
}
