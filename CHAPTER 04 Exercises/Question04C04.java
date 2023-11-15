import java.util.Scanner;

public class Question04C04 {
    public static void main(String[] args) {
        double length, area;
        System.out.print("\nEnter the length of a side of the hexagon : ");
        try(Scanner getLength = new Scanner(System.in)){
           length = getLength.nextDouble();
        }
        area = (6 * Math.pow(length, 2.0)) / ( 4 * Math.tan(Math.PI / 6));
        System.out.printf("\nThe area of the hexagon is %.2f", area);
        System.out.println("\n");
    }
}
