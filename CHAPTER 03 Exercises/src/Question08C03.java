import java.util.Scanner;

public class Question08C03 {
    public static void main(String[] args) {
        int number1, number2, number3, largest = 0, smallest = 0, middleNumber;
        try(Scanner getNumbers = new Scanner(System.in)){
            System.out.print("\nEnter three integers separated by space : ");
            number1 = getNumbers.nextInt();
            number2 = getNumbers.nextInt();
            number3 = getNumbers.nextInt();
        }
        smallest = Math.min(Math.min(number1, number2), number3);
        largest = Math.max(Math.max(number1, number2), number3);
        middleNumber = number1 + number2 + number3 - largest - smallest;
        System.out.println("\nIn asceding order : " + smallest + ", " + middleNumber + ", " + largest + "\n");
    }
}
