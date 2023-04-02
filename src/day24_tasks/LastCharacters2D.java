package day24_tasks;
/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */

public class LastCharacters2D {
    public static void main(String[] args) {

        String[][] info = {{"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

                for(String [] eachArr : info){
                    for(String eachWord : eachArr){
                        System.out.print(eachWord.substring(eachWord.length()-1));

                    }
                    System.out.println();

                }



    }
}
