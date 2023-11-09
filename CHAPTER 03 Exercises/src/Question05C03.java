import java.util.Scanner;

public class Question05C03 {
    public static String computeDayName( int day) {
        String dayName = "";
        switch (day) {
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
            case 7:
                dayName = "Saturday";
                break;
            default:
                break;
        }
        return dayName;
    }
    public static void main(String[] args) {
        int today, futureDays = 0, futureDay;
        System.out.println("\nDays of the week are numbered as follows:\n01.\tSunday\n02.\tMonday\n03.\tTuesday\n04.\tWednesday\n05.\tThursday\n06.\tFriday\n07.\tSaturday");
        System.out.print("\nEnter today's day : ");
        try(Scanner getData = new Scanner(System.in)){
            today = getData.nextInt();
            if(today > 7 || today < 1){
                System.out.println("\n" + today + " is out of numbered days range i.e. 1 - 7\n");
            }else{
                System.out.print("\nEnter the number of days elapsed since today : ");
                futureDays = getData.nextInt();
                if ( futureDays < 0 ) {
                    futureDay = (futureDays + today) % 7;
                    System.out.println("\nToday is " + computeDayName(today) + " and the past day was " + computeDayName(futureDay) + "\n");
                }else{
                    futureDay = (futureDays + today) % 7;
                    System.out.println("\nToday is " + computeDayName(today) + " and the future day is " + computeDayName(futureDay) + "\n");
                }
            }
        }
    }
}
