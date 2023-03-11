package day11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    /*
    ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

based on the number they picked print a message
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number based on the language they wanted to use: \n\t1- English\n\t2 - Spanish \n\t3 - Turkish \n\t4 - Russian \n\t5 - French");

        int languageNum = input.nextInt();

        if(languageNum == 1){
            System.out.println("Hello, thank you for tha call");

        } else if (languageNum == 2){
            System.out.println("Hello, gracias llamada.");
        }else if (languageNum == 3){
            System.out.println("Merhaba aradaginiz icin tesekkurler.");
        }else if (languageNum == 4){
            System.out.println("Privet, spasiba za vash zvonok");

        }else if (languageNum == 5){
            System.out.println("Merci ........");
        }else if (languageNum == 6){
            System.out.println("Tez de gorum. Konturum gurtardi");
        }else {
            System.out.println("Invalid input");
        }
        System.out.println();

    }
}
