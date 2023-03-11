package day12_switch_statements;
/*

 */

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the wending machine");
        System.out.println("Please, select one of the following \n\tDrinks\n\tSnacks\n\tGum\n\nEnter: ");

        String selection = input.next();
        String msg;

        switch (selection){
            case"Drinks":
                System.out.println("You chose drinks:\n\t water\n\tSoda\n\tJuice\n\nYour number");
                int drinkNumber = input.nextInt();

                if (drinkNumber == 1) {
                    msg = "You have selected water";
                } else  if (drinkNumber == 2) {
                    msg = "You have selected soda";
                } else if (drinkNumber == 3) {
                    msg = "You have selected juice";
                } else {
                    msg = "invalid input";
                }
                break;
            case "Snacks":
                System.out.print("\nYour chose snacks (click on 1, 2, 3): \n\t1) Candies\n\t2) Pringles\n\t3) Chips\n\nYour number");
                int snackNUmber = input.nextInt();


                if (snackNUmber == 1) {
                    msg = "You have selected Love";
                } else  if (snackNUmber == 2) {
                    msg = "You have selected Turbo";
                } else if (snackNUmber == 3) {
                    msg = "You have selected Dirol";
                } else {
                    msg = "invalid input";
                }
                break;
            case "Gum":
                System.out.print("\nYour chose gums (click on 1, 2, 3): \n\t1) Love\n\t2) Turbo\n\t3) Dirol\n\nYour number");
                int gumNUmber = input.nextInt();

                if (gumNUmber == 1) {
                    msg = "You have selected water";
                } else  if (gumNUmber == 2) {
                    msg = "You have selected soda";
                } else if (gumNUmber == 3) {
                    msg = "You have selected juice";
                } else {
                    msg = "invalid input";
                }
                break;
            default:
                msg = "Not valid selection";

        }
        System.out.println(msg);
    }
}
