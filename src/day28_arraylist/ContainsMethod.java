package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Jerry");
        names.add("Mickey");
        names.add("Mouse");

        System.out.println(names);

        //.contains();----> It will boolean value
        System.out.println(names.contains("Jerry"));
        System.out.println(names.contains("jerry"));

        boolean isInLis = names.contains("Mouse");
        System.out.println(isInLis);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        System.out.println(nums.contains(200));
    }
}
