public class Question06C05 {
    public static void main(String[] args) {
        System.out.println("\nMile\tKilometers  |  Kilometers\tMile");
        for (int i = 1, x = 20; i < 10 && x <= 65; i++, x = x + 5) {
            System.out.printf("%3d\t%7.2f\t    |   %5d\t\t%.2f", i, (i * 1.609), x, (x / 1.609));
            System.out.println("");
        }
        System.out.println();
    }
}
