package day21_arrays;
/*
all string types
0 -> id
1 -> first name
2 -> last name
3 -> batch number
 */

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String [] student1 = {"B001", "Tom", "Jerry", "B#1"};
        System.out.println("This is the info for student1: "+ Arrays.toString(student1));

        String [] student2 = new String[4];
        System.out.println("This is the info for student2: "+ Arrays.toString(student2));
        student2[0] ="B002";
        student2[1] = "John";
        student2[2] = "Wick";
        student2[3] = "B#2";
        System.out.println("This is the info for student2: "+ Arrays.toString(student2));

        String[] student3 = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID:");
        student3[0] = input.next();

        System.out.println("Enter name");
        student3[1] = input.next();

        System.out.println("Enter lastname");
        student3[2] = input.next();

        System.out.println("Enter Bathc No:");
        student3[3] = input.next();
        System.out.println("This is the info for Student3:" + Arrays.toString(student3));



        String []questions  = {"Enter ID", "Enter name:", "Enter lastname:", "Enter Batch NO:"};
        String []student4 = new String[4];

        for (int i = 0; i < 4; i++) { // this is for loop
            System.out.println(questions[i]);
            student4[i] = input.next();

        }
        System.out.println("This is the info for Student4:" + Arrays.toString(student4));


    }
}
