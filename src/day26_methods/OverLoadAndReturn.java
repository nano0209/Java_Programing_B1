package day26_methods;

public class OverLoadAndReturn {
    public static void method(){
    System.out.println("Just Printing by default");
    }


    // return type being different does not mean that they are overloaded.Changing the return type does not  mean we overloaded the method.
//    public static int method(){
//        System.out.println("Just Printing by default");
//        return 1;

    public static int method(int num ) {
        System.out.println("Just Printing by default");
        return 1;


    }

}
