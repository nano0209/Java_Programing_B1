package day33_a_static;

public class Iphone {

    String modal;
    double price;
//    static String company = "Apple";
//    static String os = "IOS";
//    static  boolean appleDay = false;
    static String company;
    static String os;
    static boolean appleDay;

    static {
        company = "Apple";
        String os = "IOS";
        appleDay = false;

    }
    public Iphone(String model, double price){
        this.modal = model;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Iphone Info: " +
                "\nmodal: \t" + modal +
                "\nprice: \t$" + price;

    }
}