public class Question12C05 {
    public static void main(String[] args) {
        int theNumber = 0;
        int i = 300;
        while (Math.pow(i, 2.0) > 12000) {
            theNumber = i;
            i--;
        }
        System.out.println("\nThe smallest integer n is " + theNumber + "\n");
    }
}
