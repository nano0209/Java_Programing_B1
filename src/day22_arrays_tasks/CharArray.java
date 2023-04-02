package day22_arrays_tasks;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String [] letters = {"l", "o", "o", "p"};
        System.out.println(Arrays.toString(letters));

        //different method
        String  letter = "Loop";



        String word = "loop";
        char [] convertedWord = word.toCharArray();
        //System.out.println(Arrays.toString());
        System.out.println(convertedWord[0]);
        System.out.println(convertedWord[1]);
        System.out.println(convertedWord[2]);
        System.out.println(convertedWord[3]);


        //for each loop
        System.out.println("-------------------");
        for(char eachCharacter : convertedWord){
            System.out.println(eachCharacter);
        }

    }

}
