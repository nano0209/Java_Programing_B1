package day26_methods;

public class ArrayIndexOf {

    public static void main(String[] args) {

        String str = "loop";
        int index = str.indexOf('l');

        int[] arr = {3, 1, 546, 34, 23};
        int num = 546;

        System.out.println(indexOf(arr, num));
        System.out.println(indexOf2(arr, num));
        System.out.println(indexOf(new String [] {"apple" ,"loop", "Tom", "Jerry"}, "Jerry"));
    }

//This method with FOR EACH method:
    public static int indexOf(int[] arr, int num) {
        int locationOfElement = 0;
        for (int each : arr) {  //{3,1,546,34,23}; num=444

            if (each == num) {
                return locationOfElement;
            }else{
                locationOfElement++;
            }
        }
        return -1;

    }


    // This method with FORI method:

    public static int indexOf2(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== num){
                return i;
            }
        }
        return -1;

        }

    public static int indexOf(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)){
                return i;
            }
        }
        return -1;

    }
}

