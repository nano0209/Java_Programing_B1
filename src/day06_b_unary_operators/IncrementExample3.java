package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args){

        int i = 5;
        int z = i++; //z = 5 i = i+i ---> i = 6


        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = ( a + 1);

        System.out.println(a);
        System.out.println(b);

        int c = ++a;
        System.out.println(c);


    }



}
