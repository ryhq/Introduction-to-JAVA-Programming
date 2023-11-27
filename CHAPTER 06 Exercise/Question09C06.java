public class Question09C06 {
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
    public static void main(String[] args) {
        System.out.println("\nFeet\t    Meters \t|        Feet \t  Meters");
        for (
                double foot = 1.0, 
                meter = 20.0; 
                foot <= 10.0 &&
                meter <= 65.0; 
                foot += 1.0,
                meter += 5.0
            ) {
            System.out.printf("%5.1f \t %7.3f\t|\t%5.1f \t %7.3f", foot, footToMeter(foot), meter, meterToFoot(meter));
            System.out.println();
        }
    }
}
