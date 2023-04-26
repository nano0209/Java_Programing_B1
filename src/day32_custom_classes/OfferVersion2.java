package day32_custom_classes;

public class OfferVersion2 {

    // location, company, salary, is full time, number of PTO

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;
    /*
    - constructor

        - create a constructor that creates an Offer object with the company and location

        - create a constructor that creates an Offer object with the company, location, and salary

        - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

*/

    public OfferVersion2(String company, String location) {
        this.company = company;
        this.location = location;

    }

    public OfferVersion2(String company, String location, double salary) {
//        this.company = company;
//        this.location = location;
        this(company, location); // we can do like this
        this.salary = salary;

    }

    public OfferVersion2(String company, String location, double salary, boolean isFullTime) {
//        this.company = company;
//        this.location = location;
//        this.salary = salary;
        this(company, location, salary);// we can do like this
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;



    }
    @Override
    public String toString() {
        return "Offer" +
                "\nlocation='" + location +
                "\ncompany='" + company +
                "\nsalary=" + salary +
                "\nisFullTime=" + isFullTime +
                "\nnumOfPTO=" + numOfPTO;
    }
}
