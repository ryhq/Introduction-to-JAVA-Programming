import java.util.Scanner;

public class Question19C03 {
    public static void main(String[] args) {
        double base, height, hypotenuse;
        System.out.print("\nEnter three egdes length for triangle : ");
        try(Scanner getEdges = new Scanner(System.in)){
            base = getEdges.nextDouble();
            height = getEdges.nextDouble();
            hypotenuse = getEdges.nextDouble();
        }
        if (base + height > hypotenuse && base + hypotenuse > height && height + hypotenuse > base) {
            System.out.println("\nThe perimeter of a triangle with " + base + ", " + height + " and " + hypotenuse + " edges is " + (base + height + hypotenuse) + "\n");
        }else{
            System.out.println("\nThe input is valid if the sum of every pair of two edges is greater than the remaining edge\n");
        }
    }
}
