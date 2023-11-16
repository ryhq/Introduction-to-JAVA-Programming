import java.util.Scanner;

public class Question24C04 {
    public static void main(String[] args) {
        try(Scanner getCities = new Scanner(System.in)){
            System.out.print("\nEnter the first city : ");
            String cityOne = getCities.nextLine();
            System.out.print("\nEnter the second city : ");
            String cityTwo = getCities.nextLine();
            System.out.print("\nEnter the third city : ");
            String cityThree = getCities.nextLine();
            if (cityOne.compareToIgnoreCase(cityTwo) < 0 && cityOne.compareToIgnoreCase(cityThree) < 0) {
                if (cityTwo.compareToIgnoreCase(cityThree) < 0) {
                    System.out.println("\nThe cities in alphabetical order " + cityOne + ", " + cityTwo + " and " + cityThree + "\n");
                }else{
                    System.out.println("\nThe cities in alphabetical order " + cityOne + ", " + cityThree + " and " + cityTwo + "\n");
                }
            } else if (cityTwo.compareToIgnoreCase(cityOne) < 0 && cityTwo.compareToIgnoreCase(cityThree) < 0) {
                if (cityOne.compareToIgnoreCase(cityThree) < 0) {
                    System.out.println("\nThe cities in alphabetical order " + cityTwo + ", " + cityOne + " and " + cityThree + "\n");
                }else{
                    System.out.println("\nThe cities in alphabetical order " + cityTwo + ", " + cityThree + " and " + cityOne + "\n");
                }
            } else if (cityThree.compareToIgnoreCase(cityOne) < 0 && cityThree.compareToIgnoreCase(cityTwo) < 0) {
                if (cityOne.compareToIgnoreCase(cityTwo) < 0) {
                    System.out.println("\nThe cities in alphabetical order " + cityThree + ", " + cityOne + " and " + cityTwo + "\n");
                }else{
                    System.out.println("\nThe cities in alphabetical order " + cityThree + ", " + cityTwo + " and " + cityOne + "\n");
                }
            }
        }
    }
}
