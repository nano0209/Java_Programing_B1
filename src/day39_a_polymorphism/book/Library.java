package day39_a_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        // Reference itself
        JavaTextBook b1 = new JavaTextBook();
        b1.name = "Java Programming";
        b1.size = 30;
        b1.fun = true;
        b1.read();
        b1.open();
        b1.downloadable();
        System.out.println("--------");


        // Reference is Super Class
        EBook b2 = new JavaTextBook();
        b2.name = "Java Programming2";
        b2.size = 40;
        // Since reference is super class we canNOT access child class instance
        //b2.fun = false;
        //((JavaTextBook)b2).fun = false;
        b2.read();
        b2.open();
        b2.downloadable();
        System.out.println();

        // Reference is BOOK
        Book b3 = new JavaTextBook();
        b3.name = "Java Programming3";
        // Since reference is super class we canNOT access child class instance
        //b3.size = 50;
        //b3.fun = false;



        // Reference is Interface
        Downloadable b4 = new JavaTextBook();
        // Since reference is INTERFACE we canNOT access child class instance
        //b4.name = "Java Programming4";
        //b4.size = 60;
        //b4.fun = false;
        b4.downloadable();
        // Since reference is INTERFACE we canNOT access child class instance
        //b4.read();
        //b4.open();


    }
}

/*
    For the accessibility -  the reference side is taken into consideration.

    For the execution - the object side is taken into consideration
        1. If the method is OVERRIDEN, the execution will take on that overriden method.

        2. If the method is NOT OVERRIDEN, the execution will take the parent class method.

 */


