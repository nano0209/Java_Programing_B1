package day28_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(700);
        nums.add(500);
        System.out.println(nums);
        System.out.println(nums.size()); //4


        System.out.println(nums.isEmpty());

        System.out.println("Now clearing the ArrayList");
        nums.clear();
        System.out.println(nums);
        System.out.println(nums.size()); // 0

        System.out.println(nums.isEmpty()); //true



        }
    }

