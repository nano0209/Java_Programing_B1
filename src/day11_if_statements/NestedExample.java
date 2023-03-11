package day11_if_statements;

import java.util.Scanner;

public class NestedExample {
    /*
    ask a number from user:
    if number = between 1 and 10
         than check ist is even or odd
     else
         number is not in the range
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = input.nextInt();

        if (number >= 1 && number <= 10){
            if( number % 2 == 0) {

                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }


        }else {
            System.out.println("The number is not in the range");
        }

    }
}
