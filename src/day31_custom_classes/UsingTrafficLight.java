package day31_custom_classes;

public class UsingTrafficLight {

    public static void main(String[] args) {

        TrafficLight lightOne = new TrafficLight();
        lightOne.color = "Red";
        System.out.printf("li");

        TrafficLight lightTwo = new TrafficLight("Green");
        System.out.println(lightTwo);

        TrafficLight lightThree = new TrafficLight("yello");
        System.out.println(lightThree);

    }
}
