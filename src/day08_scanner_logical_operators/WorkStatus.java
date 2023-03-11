package day08_scanner_logical_operators;

import java.util.Scanner;

public class WorkStatus {
    //create Scanner object
    //        ask the user to enter their first name - next
    //        ask the user to enter their last name - next
    //        ask the user if they are employed - boolean
    //        ask the user if they are a student - boolean
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in) ;
        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();
        System.out.println("First name:\t" + firstName );

        System.out.print("How are you");
        String feeling = input.next();

        System.out.print("What is the best team");
        String bestTeam = input.next();

        input.nextLine();
        System.out.print("how much are you making");
        String answerSalary = input.nextLine();

        System.out.println("\nFirst name:\t" + firstName + "\nLast name:\t" + lastName);


    }
}
