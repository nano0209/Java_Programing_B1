package day37_a_abstraction.car;

public class Tesla extends ElectricCar {

    @Override
    public void start() {
        System.out.println("Starting by card");

    }

    public void charging(){
        System.out.println("Tesla is charging by plugin");

    }
}
