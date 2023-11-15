import java.util.Scanner;

public class Question02C04 {
    public static void main(String[] args) {
        final double EARTH_RADIUS = 6371.01;
        double x1, y1, x2, y2, distance;
        System.out.print("\nEnter point 1 (latitude and longitude) in degrees : ");
        try(Scanner getPoint1 = new Scanner(System.in)){
            x1 = getPoint1.nextDouble();
            y1 = getPoint1.nextDouble();
            System.out.print("\nEnter point 2 (latitude and longitude) in degrees : ");
            x2 = getPoint1.nextDouble();
            y2 = getPoint1.nextDouble();
        }
        // d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        distance = EARTH_RADIUS * Math.acos(
            (Math.sin(
                    Math.toRadians(x1)
                ) * Math.sin(
                    Math.toRadians(x2)
                )
            ) + (
                    Math.cos(
                        Math.toRadians(x1)
                    ) * Math.cos(Math.toRadians(x2))
                ) * Math.cos(
                    Math.toRadians(y1 - y2)
                    )
        );
        System.out.println("\nThe distance between the two points is : " + distance + " km\n");
    }
}
