package day06_b_unary_operators;

public class IncrementExample2 {
    public static void main(String[] arg){

        int age = 20;

        System.out.println(age--); //20 still satme number

        System.out.println(age); //19

        System.out.println(++age); // 20

        System.out.println(--age); //19

        --age; //age = -1 ---> 18

        System.out.println(--age); //17


    }
}
