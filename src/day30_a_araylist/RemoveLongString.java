package day30_a_araylist;
//Create a method that accepts list of Strings and the int num and returns another list but the strings which are longer than the int number removed.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveLongString {
    public static ArrayList<Integer> removeDup (ArrayList <Integer> list) {
        list.removeIf( each -> Collections.frequency(list, each) > 1 );
        return list;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(nums);
        System.out.println(removeDup(nums));
    }


}

