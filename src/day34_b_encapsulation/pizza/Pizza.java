package day34_b_encapsulation.pizza;

public class Pizza {
    //Private date: size, numOfToppings
    private String size;
    private int numOfToppings;


    public Pizza(String size, int numOfToppings) {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        if (size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("large")) {
            this.size = size;
        } else {
            System.out.println("Not correct size");
        }


    }

    public int getNumOfToppings() {
        return numOfToppings;
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings > 0) {
            this.numOfToppings = numOfToppings;
        } else {
            System.out.println("The number can not be less that 0");
        }

    }

    public double calculatePrice() {
        double price = 0;
        if (size.equalsIgnoreCase("small")) {
            price = 10 + (numOfToppings * 0.5);
        } else if (size.equalsIgnoreCase("medium")) {
            price = 12 + (numOfToppings * 0.5);

        } else if (size.equalsIgnoreCase("medium")) {
            price = 14 + (numOfToppings * 0.5);

        }
        return price;


    }

    public String toString(){
        return "Pizza size: " + size + ", number of toppings " + numOfToppings + ". Total price $" + calculatePrice();

    }
}
