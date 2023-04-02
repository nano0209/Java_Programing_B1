package day22_arrays_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {

        String [] str = {"a", "b", "c"};
        System.out.println(Arrays.toString(str));

        System.out.println(String.join("<>", str));
        System.out.println(String.join("-------", str));
        System.out.println(String.join("*******", str));
        System.out.println(String.join(" ", str));
        System.out.println(String.join("", str));
    }
}
