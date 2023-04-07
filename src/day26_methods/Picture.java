package day26_methods;

public class Picture {
    // How about if I have same methodName with either different parameter amounts, or different dataType.

    // draw (int a){};
    // draw (double b)
    // draw (boolean c)
    // draw (int a, double d)

    public static void main(String[] args) {



    }
    public static  void draw (){  // non- parameterized method
        System.out.println("Trying to draw");

    }
    public static void draw (String color){ // parameterize method overloaded method
        System.out.println("Drawing with the "+ color);

    }
    public static void draw (String color, String color2){
        System.out.println("Drawing with two different colors"+ color+ "and" +color2);
    }

    public static void draw (int size){
        System.out.println("Drawing in this size:" +size);

    }

    public static void draw (String str, int size){
        System.out.println("Just drawing");

    }

    //We can not overload with the different PARAMETER NAME. It has two different dayaType or different amount.

    //public static void draw (int length){
        //System.out.println("Drawing in this size:" +length);

}
