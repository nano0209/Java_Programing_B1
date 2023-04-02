package day21_arrays;
/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1]
 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] original = {1, 2, 3, 4, 5, 7, 8, 9};
        int [] reversed = new int[original.length];

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reversed));

        for (int i = original.length-1; i >=0; i--) {
            reversed[reversed.length-1] = original[i];

        }

    }

}
