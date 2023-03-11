package day05_variables;

public class RecapVariables {
    public static void main(String [] args){

        //declare variable

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentInClass;

        //We can not print the variables because they do not have a value
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentInClass);

        // Assign the value
        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);

        // 2*543
        System.out.println(numberOfCoffeeCups + "*" + totalStudentInClass);


        //Declare and assign
        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("\nThis is my temperature: " + temperature);
        System.out.println("It is day " + javaDays + " in java class");


    }
}
