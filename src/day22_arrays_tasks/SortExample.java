package day22_arrays_tasks;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {2, 3, 8, 4, 7, -4};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Min:" +nums[0]);
        System.out.println("Max:" +nums[nums.length-1]);

        int [] num2 = {20, 30, 80, 10, 40, 70, -40};
        int [] num3 = num2; // we did not make a new array.
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));

    }
}
