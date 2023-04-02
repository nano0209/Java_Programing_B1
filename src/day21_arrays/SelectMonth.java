package day21_arrays;
/*
Ask the user the month number they want print the month name
1 -----> January
12 ----> December
Assume only valid numbers are given, but as a challenge you can handle invalid numbers
 */

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter which month number you want");
        int mothNum = input.nextInt();

        String [] allMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("The number you entered represents this month: " + allMonths [mothNum - 1]);



    }
}
