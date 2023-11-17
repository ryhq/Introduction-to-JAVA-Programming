public class Question07C05 {
    public static void main(String[] args) {
        double tuition = 10000, fourTuition = 0;
        System.out.println("\nYear\tTuition Fee");
        for (int i = 1; i <= 10; i++) {
            tuition = tuition + (tuition * ( 5 / 100.0));
            if (i == 4) {
                fourTuition = tuition;
            }
            System.out.printf("%3d %13.2f", i, tuition);
            System.out.println();
        }
        System.out.printf("\nTuition fee in the coming 10 years will be %.2f\n\n", tuition);
        System.out.printf("Total cost of four years\' worth of tuition after the tenth year %.2f\n\n", (tuition + fourTuition));
    }
}
