import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS_PER_YEAR = 365;
        int minutes, days, years;
        try (Scanner getMinutes = new Scanner(System.in)) {
            System.out.print("\nEnter the number of minutes : ");
            minutes = getMinutes.nextInt();
        }
        days = (minutes / 60) / 24;
        years = days / NUMBER_OF_DAYS_PER_YEAR;
        days = days % NUMBER_OF_DAYS_PER_YEAR;
        System.out.println("\n" + minutes + " minutes is approximately " + years + " years and " + days + " days\n");
    }    
}
