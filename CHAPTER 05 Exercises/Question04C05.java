public class Question04C05 {
    public static void main(String[] args) {
        System.out.println("\nMiles\tKilometer");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%3d\t%3.3f", i, (i * 1.609));
            System.out.println();
        }
    }
}
