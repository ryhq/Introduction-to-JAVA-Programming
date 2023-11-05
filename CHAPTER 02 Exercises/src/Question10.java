import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        final int CONSTANT = 4184;
        double intialTemperature, finalTemperature, massOfWater, energy;
        try (Scanner getData = new Scanner(System.in)) {
            System.out.print("\nEnter the mass of water in kilogram : ");
            massOfWater = getData.nextDouble();
            System.out.print("\nEnter the initial temperature : ");
            intialTemperature = getData.nextDouble();
            System.out.print("\nEnter the final temperature : ");
            finalTemperature = getData.nextDouble();
        }
        energy = massOfWater * ( finalTemperature - intialTemperature ) * CONSTANT;
        System.out.println("\nThe energy needed is : " + energy + "\n");
    }
}
