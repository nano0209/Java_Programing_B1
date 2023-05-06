package day38_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {

        Turkish tr = new Turkish();
        tr.hi();
        tr.bye();

        Spanish sp = new Spanish();
        sp.hi();
        sp.bye();

    }
}
