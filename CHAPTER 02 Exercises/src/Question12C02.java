import java.util.Scanner;

public class Question12C02 {
    public static void main(String[] args) {
        double acceleration;
        double speed;
        double length;
        try (Scanner getFindings = new Scanner(System.in)) {
            System.out.print("\nEnter airplane\'s speed : ");
            speed = getFindings.nextDouble();
            System.out.print("\nEnter airplane\'s acceleration : ");
            acceleration = getFindings.nextDouble();
        }
        length = (Math.pow(speed, 2.0)) / ( 2 * acceleration );
        System.out.println("\nThe minimum runway length for this airplane is : " + length + "\n");
    }
}
