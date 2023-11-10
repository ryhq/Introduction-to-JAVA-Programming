import java.util.Scanner;

public class Question22C03 {
    public static void main(String[] args) {
        double point1, point2, distance;
        System.out.print("\nEnter a point with two coordinates as x y : ");
        try(Scanner getPoints = new Scanner(System.in)) {
            point1 = getPoints.nextDouble();
            point2 = getPoints.nextDouble();
        }
        distance = Math.pow((Math.pow((point1 - 0), 2.0) + Math.pow((point2 - 0), 2.0)), 0.5);
        if (distance <= 10) {
            System.out.println("\nPoint (" + point1 + ", " + point2 + ") is in the circle\n");
        }else{
            System.out.println("\nPoint (" + point1 + ", " + point2 + ") is not in the circle\n");
        }
    }
}
