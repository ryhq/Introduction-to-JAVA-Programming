public class Question05C05 {
    public static void main(String[] args) {
        System.out.println("\nKilograms\tPounds  |  Pounds\tKilograms");
        for (int i = 1, x = 20; i < 200 && x <= 515; i++, x = x + 5) {
            System.out.printf("%3d\t      %7.2f\t|   %3d\t\t%7.2f", i, (i * 2.2), x, (x / 2.2));
            System.out.println();
        }
        System.out.println();
    }
}
