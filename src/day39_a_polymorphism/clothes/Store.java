package day39_a_polymorphism.clothes;

public class Store {

    public static void main(String[] args) {

        // All possible references


        TShirt t1 = new TShirt(); //reference itself
        t1.wear();

        System.out.println();

        //Reference is -----> Super class
        Clothes t2 = new TShirt();
        t2.wear();

        //TShirt class does not implement HasHood
        //HasHood t3 = new TShirt();

        //Reference is ---> Itself
        Jacket j = new Jacket();
        j.wear();
        j.putHood();


        //Reference is -----> Super Class
        Clothes j2 = new Jacket();
        j2.wear();


        //Reference is ------> Interface
        HasHood j3 = new Jacket();
        j3.putHood();



        //The reference is -----> Interface
        HasHood t4 = new Jacket();


        //Reference is ------> Object Class
        Object o = new Jacket();
       // o.wear();// no access
       // o.putHood(); // no access
        o.toString();


    }
}
