import java.util.Scanner;

public class Question03C02 {
    public static void main(String[] args) {
        final double FOOT_TO_METER = 0.305;
        double feet;
        double meter;
        try (Scanner getDistance = new Scanner(System.in)) {
            System.out.print("\nEnter a value for feet : ");
            feet = getDistance.nextDouble();
        }
        meter = feet * FOOT_TO_METER;
        System.out.println("\n" + feet + " feet is " + meter + " meters\n");

    }
}
