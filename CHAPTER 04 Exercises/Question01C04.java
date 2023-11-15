import java.util.Scanner;

public class Question01C04 {
    public static void main(String[] args) {
        double length, area, sideLength;
        System.out.print("\nEnter the length from the center to a vertex of the pentagon : ");
        try(Scanner getLength = new Scanner(System.in)){
            length = getLength.nextDouble();
        }
        sideLength = 2 * length * Math.sin((Math.PI) / 5 );
        area = (5 * Math.pow(sideLength, 2)) / (4 * Math.tan((Math.PI) / 5));
        System.out.printf("\nThe area of the pentagon is %.2f", area);
        System.out.println("\n");
    }
}
