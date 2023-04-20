package day31_custom_classes;

public class Phone {

    String name;
    String  brand;
    int memory;
    double version;

    //Create a construction that accepts only one parameter which name


    public Phone(String name){
        this.name = name;

    }

    //Create another construction that accepts Two parameters which are name and brand

    public Phone(String  name, String brand){
        this.name = name;
        this.brand = brand;




    }

    @Override
    public String toString() {
        return "Phone" +
                "\nname: " + name +
                "\nbrand: " + brand +
                "\nmemory: " + memory +
                "\nversion: " + version;
    }

    public Phone(String  name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;




    }


}
