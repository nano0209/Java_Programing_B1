package day21_arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String city1 = "Fairdax";
        String city2 = "New York";
        String city3 = "Alexandria";
        String city4 = "Bethesda";
        String city5 = "Reston";
        String city6 = "Gaithersburg";


        String[] cities = {"Fairfax", "New York", "Alexandria", "Bethesda"}; // or
        //String [] cities2 ={city1, city2, city3, city4, city5};

        System.out.println(Arrays.toString(cities));

        System.out.println(Arrays.toString(cities).substring(1 )); // begining  sentence without curly brace.

        System.out.println(Arrays.toString(cities).substring(1,Arrays.toString(cities).length()-1)); // without curly braces begining and end.

        System.out.println(cities.length); //this gives length of the sentence
        ;
    }
}
