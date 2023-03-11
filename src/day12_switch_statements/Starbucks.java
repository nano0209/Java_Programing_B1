package day12_switch_statements;
/*
Declare price and calories variables

 Ask the user to enter which size drink they want

 Based on the drink size determine the price and calories of the order

 At the end print the details of the order

     data:
         size: tall
         price: 2.50
         calories: 100

         size: grande
         price: 4.00
         calories: 150

         size: venti
         price: 4.50
         calories: 200
 */

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price =0.0;
        int calories = 0;
        System.out.println("Which size drink they want");
        String size = input.next();
        boolean isSize = true;

        switch (size) {
            case "Tall":
                price = 2.50;
                calories = 100;
                break;
            case "Grande":
                price = 4.00;
                calories = 150;
                break;
            case "Venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We do not have that size");
                isSize = false;
        }
        if(isSize){
            System.out.println("Your order for " +size +" coffee prise is " +price+ " and calories" + calories);

        }



    }
}
