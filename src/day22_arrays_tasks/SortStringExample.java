package day22_arrays_tasks;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] str = {"java", "Loop", "while", "Softskills", "Hello", "bye", "$", "54Test"};
        System.out.println(Arrays.toString(str));


        Arrays.sort(str);
        System.out.println(Arrays.toString(str));


        char [] ch = {'a', 'A', '#', '4'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

    }
}
