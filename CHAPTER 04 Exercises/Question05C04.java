import java.util.Scanner;

public class Question05C04 {
    public static void main(String[] args) {
        int sides;
        double length, area;
        System.out.print("\nEnter the number of sides of the polygon : ");
        try(Scanner getData = new Scanner(System.in)){
            sides = getData.nextInt();
            while (sides < 4) {
                System.out.println("\nA polygon must contain more than 4 sides!!!\n");
                System.out.print("\nEnter the number of sides of the polygon : ");
                sides = getData.nextInt();
            }
            System.out.print("\nEnter one side length of the polygon : ");
            length = getData.nextDouble();
            while (length < 0) {
                System.out.println("\nLength can not be less than 0!!!\n");
                System.out.print("\nEnter one side length of the polygon : ");
                sides = getData.nextInt();
            }
        }
        area = (sides * Math.pow(length, 2.0)) / ( 4 * Math.tan((Math.PI / sides)));
        System.out.println("\nThe area of the polygon is " + area + "\n");
    }
}
