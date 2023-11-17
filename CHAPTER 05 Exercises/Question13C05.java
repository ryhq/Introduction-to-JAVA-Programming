public class Question13C05 {
    public static void main(String[] args) {
        int theNumber = 0;
        int i = 1;
        while (Math.pow(i, 3.0) < 12000) {
            theNumber = i;
            i++;
        }
        System.out.println("\nThe smallest largest n is " + theNumber + "\n");
    }
}
