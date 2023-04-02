package day20_nested_loop;

import java.util.Scanner;

public class FinRainRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 5;
        int userNum = input.nextInt();
        System.out.println("Enter a number to check up to that number");

        for (int i = 1; i < userNum; i++) {
            String str = "";

            if (i % 3 == 0) {
                str += "FIN";

            }
            if (i % 5 == 0) {
                str += "RA";

            }


//            if(str.isEmpty()){
//                System.out.println(i);
//            }else {
//                System.out.println(str + " ");
//            }

            System.out.println(str.isEmpty() ? i : str);

        }

    }
}
