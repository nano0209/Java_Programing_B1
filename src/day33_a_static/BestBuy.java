package day33_a_static;

public class BestBuy {

    String location;

    static  String headQuarters = "Richfield, MN, USA";

    static String day = "Sunday";

    static int numOfComputer = 100;

    public BestBuy(String location){
        this.location = location;
    }

    //====================================
    // this is instance method which has return type as VOID and does noy any argument
    public  void openStore(){
        System.out.println("Opening the "+ location);
    }

    public static void reStock(){
        System.out.println(numOfComputer);
    }


}
