package day14_string;

public class RecapMethods {
    public static void main(String[] args) {

        String str = "loop"; // made by string object by LITERALS
        String str2 = new String ("loop");

        System.out.println("Compare with == " + (str == str2)); // False
        System.out.println("Compare.with.equals;()"+ str.equals(str2)); //True


        System.out.println("Compare with == " +str.equals("pen")); // False

        System.out.println("Compare with.equalsIgnoreCase()" + str.equalsIgnoreCase("LooP"));

        String word1 = "loop academy";
        System.out.println("to upper case: " + word1.toUpperCase());
        String word2 = "LOOP ACADEMY";
        System.out.println("to enter lower case: " + word2.toLowerCase());






    }
}
