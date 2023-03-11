package day12_switch_statements;

import java.util.Scanner;

/*
Given a day number, find and print the day related to the number
Enter a day number:

    1- Monday
    2- Tuesday

    6-
    7-
it is weekend
    any other number: Not a day
 */
public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number");
        int number = input.nextInt();

        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Ii ts a weekend");
                break;
            default:
                System.out.println("Not a day");

        }



    }
}
