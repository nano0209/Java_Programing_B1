package day12_switch_statements;
/*
Enter a day of week
ay print which class we have on that day, the time of the class
Cover the following as well
Monday, Mon, monday
 */
import java.util.Scanner;

public class WeekSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week:");
        String dayOfWeek = input.next();
        String message;

        switch(dayOfWeek){
            case "Monday":
            case "Mon":
            case "MONDAY":
            case "Friday":
            case "Fri":
            case "FRIDAY":
                message = "We do not have a class";
            case "Wednesday":
            case "Thursday":
                message = "We have a java class at 7 pm";
            case "Saturday":
                message = "We have a java class at 9:30 am";
            case "Sunday":
                message = "We have Soft skill class at 9:30 am ";
            default:
                message = "Sunday is not valid";
                System.out.println(message);



        }

    }
}
