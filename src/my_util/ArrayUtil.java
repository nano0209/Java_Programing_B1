package my_util;

import java.util.Arrays;

public class ArrayUtil {
    /**
     * This methods will accept an int array
     * And will return the minumum number
     */


    public static int minNumInArr (int[] arr){

        int min = arr [0];

        for (int each : arr){
            if (each < min){
                min = each;

            }
        }
        return min;

    }
    /**
     * This methods will accept an int array
     * And will return the minumum number
     */

    public static int minNumInArrWithSort(int [] arr){

        Arrays.sort(arr);
        return arr[0];
    }
}

