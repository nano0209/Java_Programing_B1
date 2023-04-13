package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(300);
        nums.add(700);
        nums.add(500);
        System.out.println(nums);

        nums.set(1, -300);
        System.out.println(nums);

        nums.set(3, 8000);
        System.out.println(nums);

        nums.set(9, 2000); // this will throw Runtime an exception of IndexOfBoundException
    }
}
