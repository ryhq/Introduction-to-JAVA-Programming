import java.util.Scanner;

public class Question11C02 {
    public static void main(String[] args) {
        int population = 312032486;
        int year = 365;
        int numberOfYears;
        int secondsPerOneBirth = 7;
        int secondsPerYear = year * 24 * 60 * 60;
        int birthsPerYear = secondsPerYear / secondsPerOneBirth;
        int secondsPerOneDeath = 13;
        int deathsPerYear = secondsPerYear / secondsPerOneDeath;
        int secondsPerOneImmigrant = 45;
        int totalImmigrants = secondsPerYear / secondsPerOneImmigrant;
        try (Scanner getYears = new Scanner(System.in)) {
            System.out.print("\nEnter number of years : ");
            numberOfYears = getYears.nextInt();
        }
        System.out.println("\nCurrent Population : " + population + "\n");
        for (int i = 1; i < numberOfYears; i++) {
            population = population + birthsPerYear - deathsPerYear + totalImmigrants;
        }
        System.out.println("The population the " + numberOfYears + " year will be : " + population + "\n");
    }
}
