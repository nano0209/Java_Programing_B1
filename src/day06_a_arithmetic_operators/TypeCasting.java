package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main (String [] args){
        byte b = 40;
        int i = b; // the byte value is automatically (implicitly) converted to int, because byte is smaller that int.

        int i2 = 100;
        //byte b2 = i2; // reassigning check the data type first. That is why we can n ot put it this way.
        byte b2 = (byte)i2; // reassigning check the data type first With Casting we can put like this.

        byte b3 = 100;// putting a value directly gives a data type automatically after checking the range.

        System.out.println("b2:" +b2);
        System.out.println("b3" + b3);



        int i3 =130;
        byte b4 =(byte)i3;
        System.out.println("b4" + b4);

    }
}
