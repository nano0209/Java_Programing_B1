package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wear a Jacket");
    }

    @Override
    public void putHood() {
        System.out.println("Put the hood on");

    }
}
