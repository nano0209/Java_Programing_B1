package day22_arrays_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        String [] bankAccOne = { "tom Jerry", "Checking", "10000234567", "100,000,00"};

        System.out.println("Number of the elements in the array:" + bankAccOne.length);
        System.out.printf("My entire array:" + Arrays.toString(bankAccOne));
        System.out.println("Account type:" +bankAccOne[1]);
        System.out.println("Account no#:" + bankAccOne[2]);
        System.out.println("Balance: $" + bankAccOne[3]);

        System.out.println("-----------------------");
        String [] bankAccTwo = new String[4];
        System.out.println("Arrays with default values:" +Arrays.toString(bankAccTwo));
        bankAccTwo [0] = "Micky Mouse";
        bankAccTwo [1] = "Saving";
        bankAccTwo [2] = "1234567876";
        bankAccTwo [3] = "1,67866776";
        System.out.println("My entire array2: " +Arrays.toString(bankAccTwo));


        String [] bankAccThree = new String[4];
       Scanner input = new Scanner(System.in);
//        System.out.println("Name: ");
//        bankAccThree [0] = input.nextLine();
//
//        System.out.println("Account type: ");
//        bankAccThree [1] = input.next();
//
//        System.out.println("Account no# ");
//        bankAccThree [2] = input.next();
//
//        System.out.println("Balance: $ ");
//        bankAccThree [3] = input.next();
//
//        System.out.println("My entire array 3: "+ Arrays.toString(bankAccThree));
//


        //different method to use:
        System.out.println("----------------------");
        String []  questions = { "Name:", "Account type ", "Account no#: ", "Balance: $ "};

        String [] bankAccFour = new String[4];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            bankAccFour[i] = input.nextLine();

        }
        System.out.println("My entire array 4: " + Arrays.toString(bankAccFour));




    }
}
