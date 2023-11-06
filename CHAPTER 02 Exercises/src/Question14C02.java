import java.util.Scanner;

public class Question14C02 {
    public static void main(String[] args) {
        double weight, height, BMI;
        try( Scanner getData = new Scanner(System.in) ){
            System.out.print("\nEnter weight in pounds : ");
            weight = getData.nextDouble();
            System.out.print("\nEnter height in inches: : ");
            height = getData.nextDouble();
        }
        weight = weight * 0.45359237; // Converting weight from pound to kilogram
        height = height * 0.0254; // Converting height from inches to meters
        BMI = weight / Math.pow(height, 2.0);
        System.out.println("\nBMI is : " + BMI + "\n"); 
    }
}
