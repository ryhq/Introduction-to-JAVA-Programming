import java.util.Scanner;

public class Question14C06 {
    public static double valueOfM(double i) {
        return ((Math.pow((-1), (i + 1))) / ((2 * i) - 1));
    }
    public static void MverseI(int i) {
        for (int j = 101; j <= i; j += 100) {
            System.out.printf("\n%4d\t%7.3f", j, 4 * (1 - valueOfM(j)));
        }
    }
    public static void main(String[] args) {
        try(Scanner getM = new Scanner(System.in)){
            System.out.print("\nEnter the highest value of m : ");
            int m = getM.nextInt();
            while (m < 100) {    
                System.out.println("\n" + m + " is not accepted!\n");            
                System.out.print("Enter the highest value of m : ");
                m = getM.nextInt();
            }
            System.out.println("\n   i \t  m(i)");
            System.out.println("_________________");
            MverseI(m);
            System.out.println("\n");
        }
    }
}
