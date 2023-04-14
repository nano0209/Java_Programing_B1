package day29_arralist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        String wantsContinue;

        do {
            System.out.println("Enter the item: ");
            //String item = input.nextLine();
            shoppingList.add(input.nextLine());
            System.out.println("Do you want to continue y/m?");
            wantsContinue = input.nextLine();


        } while (wantsContinue.equalsIgnoreCase("Y")); //or you can do this while(input.nextLine.().equalsIgnoreCase("Y"));

        System.out.println("Shopping list " + shoppingList.size() + "item");
        //looping through the list
        for (String each : shoppingList) {
            System.out.println("*\t" + each);
        }

        System.out.println("======================");

        // How can I check if my list water

        System.out.println(shoppingList.contains("water") ? "Water is on the list" : "Water is not on the list");


        //Can you remove specific item from the list?

        System.out.println("Do you want to remove any items y/n?");

        if (input.nextLine().equalsIgnoreCase("y")) {


            System.out.println("What item do you want to remove");
            String itemRemove = input.nextLine();

            shoppingList.remove(itemRemove);
        }
        System.out.println("Final list" + shoppingList);

    }

}

