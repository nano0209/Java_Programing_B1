package day08_scanner_logical_operators;

public class Discount {
    // declare and assign
    // is it the weekend
    // are you a teacher
    // are you a police officer
    // are you a firefighter
    // Do you get a discount?
    // Must be a weekend day you must be one of the given professions

    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isTeacher = true;
        boolean isPoliceOfficer = false;
        boolean isFireFighter = false;

        boolean getsDiscount;

        getsDiscount = isWeekend && (isTeacher || isPoliceOfficer || isFireFighter);







    }
}
