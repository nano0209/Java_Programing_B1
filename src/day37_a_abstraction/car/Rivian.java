package day37_a_abstraction.car;

public class Rivian extends ElectricCar {

    @Override
    public void charging() {
        System.out.println("Rivian is charging by ");

    }


    @Override
    public void start() {
        System.out.println("Started by voice control");

    }
}
