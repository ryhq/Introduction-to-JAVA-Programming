public class Question12C01 {
    public static void main(String[] args) {
        int distanceMiles = 24;
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceKilometer = distanceMiles * 1.6;
        double totalHours = hours + (minutes / 60 + (seconds / 60));
        System.out.println("Average speed in kilometers per hour : " + distanceKilometer / totalHours);
    }
}
