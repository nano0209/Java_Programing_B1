package day22_arrays_tasks;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        int [] c =a;

        System.out.println(a == b ); // Since they are two different objects we can  not compare like this.
        System.out.println(a == c); // Since array c point a, the object will be True.

        System.out.println(Arrays.equals(a, b));


        boolean result = Arrays.equals(b, c);
        System.out.println(result);

    }

}
