package day26_methods;

import java.util.Arrays;

public class AddElements {

    // create a method that accept int array and an int value
    // Then adds that value at the end of array
    // then return that array

    public static void main(String[] args) {
        int[] arr = {23, 4, 6, 6}; //

        add(arr, 67);
    }
//    public static int [] add(int [] arr, int num){
//        int [] newArr = Arrays.copyOf(arr, arr.length+1);
//        System.out.println(Arrays.toString(newArr));
//        newArr[newArr.length-1]=num;
//
//        return newArr;
//    }


    public static int[] add(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];
            newArr[newArr.length-1] = num;

        return newArr;
    }

    public static String[] add(String[] arr, String num) {

        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = num;

        return newArr;

    }
}
