import java.util.Scanner;

public class Question02C02 {
    public static void main(String[] args) {
        double radius, length, area, volume;
        try (Scanner getCylinderDimension = new Scanner(System.in)) {
            System.out.print("\nEnter the length of the cylinder : ");
            length = getCylinderDimension.nextDouble();
            System.out.print("\nEnter the radius of the cylinder : ");
            radius = getCylinderDimension.nextDouble();
            area = Math.pow(radius, 2.0) * Math.PI;
        }
        volume = area * length;
        System.out.println("\nCylinder's Area : " + area + "\n");
        System.out.println("Cylinder's Volume : " + volume + "\n");
    }
}
