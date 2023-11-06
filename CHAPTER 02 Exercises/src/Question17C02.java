import java.util.Scanner;

public class Question17C02 {
    public static void main(String[] args) {
        double outsideTemperature; // measured in degrees Fahrenheit
        double windSpeed; // speed measured in miles per hour.
        double windChillTemperature;
        try ( Scanner getData = new Scanner(System.in) ){
            System.out.print("\nEnter the temperature in Fahrenheit between -58°F and 41°F : ");
            outsideTemperature = getData.nextDouble();
            System.out.print("\nEnter the wind speed (>=2) in miles per hour : ");
            windSpeed = getData.nextDouble();
        }
        windChillTemperature = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16);
        System.out.println("\nThe wind chill temperature : " + windChillTemperature + "\n");
    }
}
