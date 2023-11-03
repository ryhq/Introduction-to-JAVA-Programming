public class Question10 {
    public static void main(String[] args) {
        int distanceKilometer = 14;
        double minutes = 45;
        double seconds = 30;
        // Adding those seconds to minutes
        minutes = seconds / 60;
        double hours = minutes / 60;
        double distanceMiles = distanceKilometer / 1.6;
        System.out.println("\nAverage Speed miles per hours : " + ( distanceMiles / hours ) + "\n");
    }
}
