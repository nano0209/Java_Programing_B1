package day14_string;

public class Contains {
    public static void main(String[] args) {

        String sentence = "Judo is more that sport";

        System.out.println(sentence.contains("is more")); // true

        System.out.println(sentence.contains("morethan")); // false

        System.out.println(sentence.contains("is than")); // false

        System.out.println(sentence.contains("is") && sentence.contains("Than"));
        System.out.println(sentence.contains("is") || sentence.contains("Than"));
        System.out.println(sentence.contains("are") || sentence.contains("Than"));
        System.out.println(sentence.contains("is") && sentence.contains("the"));
    }
}
