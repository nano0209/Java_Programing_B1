package day07_relational_operators;

public class SignType {
    /* declare and assign a number
    I want to know the sign of the number
    if the number is positive
    if the number is negative
    if the number is o

     */
    public static void main(String[] args) {
        int number = -1;

        number--; //

        boolean isPositive = number >= 0;
         boolean isNegative = number <= 0;
          boolean isZero = number == 0;

        System.out.println(number + " is bigger than zero:" + isPositive);
        System.out.println(number + " is bigger than zero:" + isNegative);
        System.out.println(number + " is bigger than zero:" + isZero);

    }
}
