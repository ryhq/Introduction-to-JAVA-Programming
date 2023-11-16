import java.util.Scanner;

public class Question17C04 {
    public static int computeMonthDays(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = year % 4 == 0 ? 29 : 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = 0;
                break;
        }
        return days;
    }
    public static int computeMonth(String monthAbbreviation) {
        int month = 0;
        switch (monthAbbreviation) {
            case "Jan":
                month = 1;
                break;
            case "Feb":
                month = 2;
                break;
            case "Mar":
                month = 3;
                break;
            case "Apr":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "Jun":
                month = 6;
                break;
            case "Jul":
                month = 7;
                break;
            case "Aug":
                month = 8;
                break;
            case "Sep":
                month = 9;
                break;
            case "Oct":
                month = 10;
                break;
            case "Nov":
                month = 11;
                break;
            case "Dec":
                month = 12;
                break;        
            default:
                break;
        }
        return month;
    }
    public static void main(String[] args) {
        int year;
        String month;
        System.out.print("\nEnter year : ");
        try(Scanner getDate = new Scanner(System.in)){
            year = getDate.nextInt();
            System.out.print("\nEnter a month (eg Apr) : ");
            month = getDate.next();
        }
        System.out.println("\n" + month + " " + year + " has " + computeMonthDays(computeMonth(month), year) + " days\n");
    }
}
