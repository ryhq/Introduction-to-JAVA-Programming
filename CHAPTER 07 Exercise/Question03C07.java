import java.util.Scanner;
public class Question03C07 {
    public static void main(String[] args) {
        int [] integers = new int[100];
        try(Scanner getNumbers = new Scanner(System.in)){
            for (int i = 0; i < integers.length; i++) {
                System.out.print("\nEnter the integers between 1 and 100 : ");
                int position = getNumbers.nextInt();
                integers[position]++;
                if (position == 0) {
                    break;
                }
            }
        }
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == 0) {
                
            }else{
                if (integers[i] > 1) {
                    System.out.print("\n" + i + " occurs " + integers[i] + " times ");
                }else{
                    System.out.print("\n" + i + " occurs " + integers[i] + " time ");
                }
            }
        }
        System.out.println("\n");
    }
}
