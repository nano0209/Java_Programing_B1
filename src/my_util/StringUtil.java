package my_util;

public class StringUtil {
    public static String reverseStr (String str) {


        String reversed = "";
        for (int i = str.length()-1; i >=0; i++) {
            reversed += str.charAt(i);

        }
        return reversed;
    }

}
