package day26_methods;

public class SumOfElements {

    // vararg ----> variable arguments means

    public static void main(String[] args) {
        int[] arr = {12, 34, 23, 12, 65};
        int[] arr2 = new int[]{34, 23, 456, 756};

        System.out.println(sumOfElem(arr));

        System.out.println(sumOfElem(arr2));

        System.out.println(sumOfElem(new int[]{12, 34, 56, 786, 78}));

        System.out.println(sumOfElem2(1, 2, 3, 4, 5));

        System.out.println(method(3, 23, 43, 234, 245, 67));
    }


    //create a method which accepts an int array and returns the sum of the elements.

    public static int sumOfElem(int[] arr) {
        int sum = 0;

        for (int each : arr) {
            sum += each;

        }
        return sum;

    }

    public static int sumOfElem2(int... arr) {
        int sum = 0;

        for (int each : arr) {
            sum += each;

        }
        return sum;

    }

    public static int method(int num, int... arr) {
        return 1;

    }

    public static int method(String str, int... arr) {
        return 2;

    }
}



