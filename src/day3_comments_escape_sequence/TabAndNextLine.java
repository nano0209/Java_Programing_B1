package day3_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args){

        //This is without any tab
        System.out.println("This is not tabbed");

        //This is with one tab
        System.out.println("\tThis is tabbed once");

        //This is with two tab
        System.out.println("\t\t This ia tabbed twice");

        //Here is it tabbed without escape sequence
        System.out.println("         This is tabbed without escape sequence.");


        //Escape example new line
        System.out.println();
        System.out.println("1)Toyota ");
        System.out.println("2)Highlander");
        System.out.println("3) White");

    }
}
