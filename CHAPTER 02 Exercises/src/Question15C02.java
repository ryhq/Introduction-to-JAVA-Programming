import java.util.Scanner;

public class Question15C02 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        try( Scanner getPoints = new Scanner(System.in) ){
            System.out.print("\nEnter x1 : ");
            x1 = getPoints.nextDouble();
            System.out.print("\nEnter y1 : ");
            y1 = getPoints.nextDouble();
            System.out.print("\nEnter x2 : ");
            x2 = getPoints.nextDouble();
            System.out.print("\nEnter y2 : ");
            y2 = getPoints.nextDouble();
        }
        System.out.println("\nThe distance between the two points is : " + Math.pow( ( Math.pow(( x2 - x1 ), 2.0) + Math.pow(( y2 - y1 ), 2.0) ), 0.5 ) + "\n");
    }
}
