import java.util.Scanner;

public class Question11C03 {
    static int days;
    public static String determineMonth(int monthNumber, int year) {
        String monthName = ""; 
        switch (monthNumber) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                days = year % 4 == 0 ? 29 : 28;
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                System.out.println("\nError! Unable to compute random month\n");
                break;
        }
        return monthName;
    }
    public static void main(String[] args) {
        int month, year;
        System.out.print("\nEnter date as mm yyyy : ");
        try(Scanner getDate = new Scanner(System.in)){
            month = getDate.nextInt();
            year = getDate.nextInt();
        }
        System.out.println("\n" + determineMonth(month, year) + " " + year + " have " + days + " days\n");
    }
}
