package day15_string;
/*
[Move first word]
       Given a sentence. Display the sentence with the first word moved to the end of the sentence.
       Ex:
       Input: Java is a fun language
       Output: is a fun language Java
       Hint: Use indexOf and substring
 */

import java.util.Scanner;

public class MoveFirstMWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //Java is a fun language
        //0123456789......
        // 1 - get index of first space
        int firstIndexOfSpcae = sentence.indexOf(" ");   // 6
        // 2 - get the first word
        String beginning = sentence.substring(0, firstIndexOfSpcae );
        // 3 - second part of the sentence
        String secondPart = sentence.substring(firstIndexOfSpcae+1);
//        String secondPart2 = sentence.substring(firstIndexOfSpace).trim();



        System.out.println(beginning);
        System.out.println(secondPart);

        System.out.println(secondPart + " " + beginning);

    }
}
