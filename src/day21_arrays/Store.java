package day21_arrays;

public class Store {
    public static void main(String[] args) {

        String [] items ={"Shoes", "Jacket", "Gloves", "Hat", "Dress", "Sunglasses"};

        boolean hasHat = false;

        for (int i = 0; i <items.length ; i++) {
            if(items[i].equalsIgnoreCase("hat")){
                hasHat = true;
                break;
            }
        }
        if(hasHat) {
            System.out.println("Hat items is available.");
        }else{
            System.out.println("hat is out of stock");
        }


    }
}
