import java.util.Scanner;

public class Question04C02 {
    public static void main(String[] args) {
        final double POUND_TO_KILOGRAM = 0.454;
        double pound, kilogram;
        try (Scanner getMass = new Scanner(System.in)) {
            System.out.print("\nEnter a number in pounds : ");
            pound = getMass.nextDouble();
        }
        kilogram = POUND_TO_KILOGRAM * pound;
        System.out.println("\n" + pound + " pounds is " + kilogram + " kilograms\n");
    }
}
