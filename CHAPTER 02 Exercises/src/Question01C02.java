import java.util.Scanner;

public class Question01C02 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        try (Scanner getDegree = new Scanner(System.in)) {
            System.out.print("\nEnter Celsius Degree : ");
            celsius = getDegree.nextDouble();
        }
        fahrenheit = ( 9.0 / 5.0 ) * celsius + 32;
        System.out.println("\n" + celsius + " degree celsius is equivalent to " + fahrenheit + " fahrenheit \n");
    }
}
