package day31_custom_classes;

public class Car {

    String model;
    int year;
    String color;
    int fuelLevel;

    @Override
    public String toString() {
        return "Car" +
                "\nmodel: " + model +
                "\nyear: " + year +
                "\ncolor: " + color  +
                "\nfuelLevel: " + fuelLevel;
    }

    public void fillTank (){
        System.out.printf("filling tank");
        fuelLevel = 100;


    }



    }

