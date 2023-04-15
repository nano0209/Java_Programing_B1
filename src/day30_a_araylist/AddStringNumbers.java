package day30_a_araylist;
/*
    Input:
    “123”, “34”, “513” Output:
    [ 6, 7, 9 ]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers { public static ArrayList <Integer> addNums (ArrayList <String> list){

    ArrayList <Integer> listOfSums = new ArrayList<>();

    for (String each : list) {  // “123”

        int sumOfEach = 0;
        for ( String every: each.split("")){  // ["1", "2", "3"]
            sumOfEach += Integer.parseInt(every);  // 1+2+3 = 6
        }
        listOfSums.add(sumOfEach);
    }

    return listOfSums;
}

    public static void main(String[] args) {

        System.out.println(addNums(new ArrayList<>(Arrays.asList("123", "34", "513"))));
    }

}
