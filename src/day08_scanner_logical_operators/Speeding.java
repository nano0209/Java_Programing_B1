package day08_scanner_logical_operators;

public class Speeding {



        /*
        declare 3 variables:
        current speed
        speed limit

        Note: If the requirement is mot clear> Ask the questions. In this case what the 65 speed should be considered.

         print
         "is this person speeding?" true or false

         */
        public static void main(String[] args) {

            int currentSpeed = 0;
            int speedLimit = 65;

            boolean isSpeeding =currentSpeed >= speedLimit;

            System.out.println("Is this person speeding? " + isSpeeding);




        }

    }

