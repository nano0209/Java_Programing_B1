package day23_multidimensional_arrays;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {

        String app = "amazon";
        String zones = " us-eas1, us-west1, us- west-2, us-west3";

        String[] envArr = zones.split(","); // we have 4 elements



//        for (int i = 0; i < envArr.length; i++) { //this is traditional for loop.
//            System.out.println(app + "is being deployed to the environment " +envArr[i]);
//
//
//        }


        //we can do like this too:
        for (String eachEnv : envArr){
            System.out.println(app + "is being deployed to the environment " +eachEnv);
        }


    }
}
