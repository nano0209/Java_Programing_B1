package day29_arralist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Coffee");
        drinks.add("tea");
        drinks.add("soda");
        drinks.add("energy drink");
        drinks.add("hot chocolate");
        System.out.println(drinks);

        ArrayList<String> drinks3 = new ArrayList<>(drinks);

        String [] drinklist = {"Juice", "Milk", "Cappuccino", "Iced coffee"};
        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList(drinklist));
        System.out.println(drinks4);

        ArrayList<String> drinks5 = new ArrayList<>(Arrays.asList("Juice2","Milk2", "Cappuccino2", "Iced Coffee2"));
        System.out.println(drinks5);


        //new method .addAll();
        ArrayList<String> drinks6 = new ArrayList<>();
        drinks.addAll(Arrays.asList("Juice3", "Milk3", "Cappuccino3", "Iced coffee3"));
        System.out.println(drinks6);

        drinks6.addAll(0,Arrays.asList("drink1", "drink2"));


    }
}
