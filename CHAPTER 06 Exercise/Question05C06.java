import java.util.Scanner;

public class Question05C06 {
    public static void displaySortedNumbers(
        double number1, 
        double number2, 
        double number3
        ) {
        double maximum = Math.max(Math.max(number1, number2), number3);
        double minimum = Math.min(Math.min(number1, number2), number3);
        double middle = number1 + number2 + number3 - maximum - minimum;
        System.out.println("\nAscending order : " + minimum + ", " + middle + ", " + maximum + "\n");
    }
    public static void main(String[] args) {
        try(Scanner getNumbers = new Scanner(System.in)){
            System.out.print("\nEnter three numbers : ");
            double number1 = getNumbers.nextDouble();
            double number2 = getNumbers.nextDouble();
            double number3 = getNumbers.nextDouble();
            displaySortedNumbers(number1, number2, number3);
        }
    }
}
