package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        ArrayList<Integer> nums;
        Integer [] arr ={1, 2, 3}; // the reason we made this with Integer datatype is that we will use array as  part of ArrayList and ArrayList works only with object type

        System.out.println(Arrays.toString(arr));

        Arrays.asList(); //this  method from Arrays class, take the array and makes it as ArrayList

        nums = new ArrayList<>(Arrays.asList(1,2,6,7,8,34));
        System.out.println(nums);

        ArrayList<IndexOfMethod> list2 = new ArrayList(Arrays.asList(arr));
        System.out.println(list2);



    }
}
