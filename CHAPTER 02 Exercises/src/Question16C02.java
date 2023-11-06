import java.util.Scanner;

public class Question16C02 {
    public static void main(String[] args) {
        double hexagonSide;
        try(Scanner getHexagonSide = new Scanner(System.in)){
            System.out.print("\nEnter the length of one hexagon side : ");
            hexagonSide = getHexagonSide.nextDouble();
        }
        System.out.println("\nThe area of the hexagon is : " + ( ( ( 3 * Math.pow(3.0, 0.5) ) / 2 ) * Math.pow(hexagonSide, 2.0)) + "\n");
    }
}
