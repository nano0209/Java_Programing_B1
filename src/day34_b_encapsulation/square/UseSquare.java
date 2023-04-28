package day34_b_encapsulation.square;

public class UseSquare {
    public static void main(String[] args) {
        Square obj1 = new Square
                (22);
        obj1 = new Square(44);



        Square obj2 = new Square(-35);
        System.out.println(obj2.getSide());


        Square obj3 = new Square(55);
        System.out.println(obj3.getSide());

    }
}
