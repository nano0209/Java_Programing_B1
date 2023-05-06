package day39_a_polymorphism.car;

public class Car {}
    /*
    //Polymorphism
    Webdriver driver = new Chrome Driver();  // we want to limit the access
    ChromeDriver driver2 = (ChromeDriver)driver;

   */

class BMW  extends Car {
    @Override
    public String toString(){
        return "BMW";
    }
}

class Tesla extends Car {

    @Override
    public String toString(){
        return "Tesla";
    }
}

class Toyota extends Car{
    @Override
    public String toString(){
        return "Toyota";
    }
}

class Ford extends Car {
    @Override
    public String toString(){
        return "Ford";
    }
}

class LandRover extends Car {
    @Override
    public String toString(){
        return "LandRover";
    }
}

