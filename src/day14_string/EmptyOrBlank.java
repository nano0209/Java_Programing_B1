package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String word1 = "Last minutes";
        System.out.println(word1.isEmpty()); // false

        word1 = "";
        System.out.println(word1.isEmpty()); // true

        word1 = " ";
        System.out.println(word1.isEmpty()); // false



    }
}
