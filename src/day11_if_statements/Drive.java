package day11_if_statements;

public class Drive {
    /*
    declare a variable called speed and assign int value
    imagine we are in neighbourhood (45) based on the speed limit print the relates message
    above 90 (inclusive) --> Your speed limit is requiring jail
    above 70 (inclusive) --> Your speed limit requires DL suspension
    above 60 (inclusive) --> Your speed limit requires a court
    below 50 (inclusive) --> Your speed limit requires a ticket
    below 35 and 50 (both inclusive) --> Your speed limit is in the speed range
    below 35 --> going to slow or you are parked
    else --> not valid input

     */
    public static void main(String[] args) {
        int speed =-10;
        if (speed<=90){
            System.out.println("Your speed limit is requiring jail");
        } else if (speed >= 70) {
            System.out.println("Your speed limit requires Dl suspension");
        } else if (speed >= 60) {
            System.out.println("Your speed limit requires court");
        } else if (speed >= 50) {
            System.out.println("Your speed limit requires ticket");
        } else if (speed >= 35 && speed <= 50) {
            System.out.println("Your speed limit is in the range");
        } else if (speed >= 0 && speed < 35) {
            System.out.println("Going to slow or you are parked");
        }else{
            System.out.println("Not valid");
        }


    }
}
