package day20_nested_loop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String  str = "AAABCCDEEF";

        for (int i = 0; i <= str.length()-1 ; i++) {

            char outerLetter = str.charAt(i);

            int count =0;
            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
                if(outerLetter == innerLetter){
                    count++;

                }

            }
            if(count ==1){
                System.out.println(outerLetter);

            }

        }
    }
}
