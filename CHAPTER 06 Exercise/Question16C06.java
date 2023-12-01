public class Question16C06 {
    public static int numberOfDaysInAYear(int year){
        int days = 365;
        if (year % 4 == 0) {
            days = 366;
        }
        return days;
    }
    public static void main(String[] args) {
        System.out.println("\n Year \t  Days");
        for (int year = 2000; year <= 2020; year++) {
            System.out.printf("%5d\t%5d", year, numberOfDaysInAYear(year));
            System.out.println();
        }
    }
}
