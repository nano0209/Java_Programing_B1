package day10_a_if_statements;

public class CheckCharacters {
    // create a char variable with a letter
    // found out if the letter is an upper case or lowercase letter

    public static void main(String[] args) {

        char letter = '$';

        if (letter >= 65 && letter <= 90) {
            System.out.println("Uppercase");

            if (letter >= 'A' && letter <= 'Z') ;
            System.out.println("Uppercase");

        } else {
            System.out.println("It is not letter");
        }


    }
}
