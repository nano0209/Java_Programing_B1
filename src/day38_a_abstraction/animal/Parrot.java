package day38_a_abstraction.animal;

//concrete class
public class Parrot extends Bird implements Flyable {

    @Override
    public void eat() {
        System.out.println("Parrots chews the seeds");

    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
