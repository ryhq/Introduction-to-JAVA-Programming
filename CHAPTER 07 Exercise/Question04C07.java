import java.util.Scanner;
public class Question04C07 {
    public static void main(String[] args) {
        int counter = 0;
        double[] scores = new double[100];
        double sum = 0, average;
        try(Scanner getNumber = new Scanner(System.in)){
            for (int i = 0; i < scores.length; i++) {
                System.out.print("\nEnter score " + (i + 1) + " : ");
                double temp = getNumber.nextDouble();
                if (temp < 0) {
                    break;
                }else{
                    scores[i] = temp;
                    sum += scores[i];
                    counter++;
                }
            }
        }
        average = sum / counter;
        int above = 0, equal = 0, below = 0;
        for (double d : scores) {
            if (d != 0) {
                if (d < average) {
                    below++;
                }else if (d == average) {
                    equal++;
                }else{
                    above++;
                }
            }
        }
        System.out.println("\nAverage score is " + average + "\n");

        System.out.println( above + " score(s) above");        
        System.out.println(equal + " score(s) equal");
        System.out.println(below + " score(s) below");
        System.out.println("\n");
    }
}
