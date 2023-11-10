import java.util.Scanner;

public class Question21C03 {
    public static int computeMonthDays(int month, int year) {
        int days = 0;
        switch (month) {
            case 13:
                days = 31;
                break;
            case 14:
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
    public static String computeDayName( int day) {
        String dayName = "";
        switch (day) {
            case 0:
                dayName = "Saturday";
                break;
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            default:
                break;
        }
        return dayName;
    }
    public static void main(String[] args) {
        int weekDay, monthDay, month, year, century;
        try(Scanner getDate = new Scanner(System.in)){
            System.out.print("\nEnter year: (e.g., 2002) : ");
            year = getDate.nextInt();
            if (year < 100 || year > 9999) {
                System.out.println("\nA year must be greater or equal to 100 but less than 9999\n");
            }else{
                System.out.print("\nEnter month: 1-12 : ");
                month = getDate.nextInt();
                if (month < 1 || month > 12) {
                    System.out.println("\nInvalid Month index!\n");
                }else{
                    if (month == 1) {
                        month = 13;
                        year = year - 1;
                    }else if (month == 2) {
                        month = 14;
                        year = year - 1;
                    }
                    System.out.print("\nEnter the day of the month : 1 - " + computeMonthDays(month, year) + " : ");
                    monthDay = getDate.nextInt();
                    if (monthDay < 1 || monthDay > computeMonthDays(month, year)) {
                        System.out.println("\nDay of the month is out of range\n");
                    }else{
                        century = year / 100;
                        weekDay = ( monthDay + ( (26 * ( month + 1 )) / 10 ) + (year % 100) + ((year % 100) / 4) + ( century / 4) + 5 * century ) % 7;
                        System.out.println("\nDay of the week is " + computeDayName(weekDay) + "\n");
                    }
                }
            }
        }
    }
}
/** 
January and February are counted as 13 and 14 in the formula, 
so you need to convert the user input 1 to 13 and 2 to 14 
for the month and change the year to the previous year
*/

