import java.util.Scanner;

public class Question09C02 {
    public static void main(String[] args) {
        double initialVelocity, finalVelocity, time, acceleration;
        try (Scanner getDimensions = new Scanner(System.in)) {
            System.out.print("\nEnter the initial velocity : ");
            initialVelocity = getDimensions.nextDouble();
            System.out.print("\nEnter the final velocity : ");
            finalVelocity = getDimensions.nextDouble();
            System.out.print("\nEnter the time taken : ");
            time = getDimensions.nextDouble();
        }
        acceleration = (finalVelocity - initialVelocity) / time;
        System.out.println("\nThe average acceleration is : " + acceleration + "\n");
    }
}
