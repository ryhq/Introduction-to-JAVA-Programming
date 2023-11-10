import java.util.Scanner;

public class Question23C03 {
    public static void main(String[] args) {
        double point1, point2, verticalDistance, horizontalDistance;
        System.out.print("\nEnter a point with two coordinates as x y : ");
        try(Scanner getPoints = new Scanner(System.in)) {
            point1 = getPoints.nextDouble();
            point2 = getPoints.nextDouble();
        }
        horizontalDistance = Math.pow(Math.pow((point1 - 0), 2.0), 0.5);
        verticalDistance = Math.pow(Math.pow((point2 - 0), 2.0), 0.5);
        if (horizontalDistance <= (10 / 2) && verticalDistance <= (5.0 / 2)) {
            System.out.println("\nPoint (" + point1 + ", " + point2 + ") is in the rectangle\n");
        }else{
            System.out.println("\nPoint (" + point1 + ", " + point2 + ") is not in the rectangle\n");
        }
    }
}
