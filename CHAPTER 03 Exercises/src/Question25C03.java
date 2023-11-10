import java.util.Scanner;

public class Question25C03 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, x4, y4, x, y, a, b, c, d, e, f;
        System.out.print("\nEnter x1, y1, x2, y2, x3, y3, x4, y4 : ");
        try( Scanner getCoefficient = new Scanner(System.in)){
            x1 = getCoefficient.nextDouble();
            y1 = getCoefficient.nextDouble();
            x2 = getCoefficient.nextDouble();
            y2 = getCoefficient.nextDouble();
            x3 = getCoefficient.nextDouble();
            y3 = getCoefficient.nextDouble();
            x4 = getCoefficient.nextDouble();
            y4 = getCoefficient.nextDouble();
        }
        a = y1 - y2;
        b = x1 - x2;
        c = y3 - y4;
        d = x3 - x4;
        e = (y1 - y2) * x1 - (x1 -x2) * y1;
        f = (y3 -y4) * x3 - (x3 -x4) * y3;
        if ((a * d - b * c) == 0) {
            System.out.println("\nThe two lines are parallel\n");
        } else {
            x = (( e * d ) - ( b * f )) / (( a * d ) - ( b * c ));
            y = (( a * f ) - ( e * c )) / (( a * d ) - ( b * c ));
            System.out.println("\nThe intersecting point is at (" + x + ", " + y + ")\n");         
        }
    }
}
