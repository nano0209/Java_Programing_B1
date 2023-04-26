package day32_custom_classes;

public class EmployeeV2 {


    //name, id, job title, salary


    String name;
    int id;
    String jobTitle;
    double salary;


    public EmployeeV2(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;

    }

    public EmployeeV2(String name, int id, String jobTitle, double salary) {
        this(name, jobTitle); // we can do like this too
        //this.name = name;
        this.id = id;
        //this.jobTitle = jobTitle;
        this.salary = salary;


    }
    // instance method which has a void return type and has no arguments

    public void goToMeeting() {
        System.out.println(name + "is going to meeting");

    }

//    public void goToMeeting(String name) {
//        System.out.println(this.name + " and " + "is going to meeting");


//    }

    public String toString() {
        String msg = "";

        msg += "\nName:" + name;
        msg += "\nJob Title:" + jobTitle;

        msg += "\n" + ((id != 0) ? id : "Name to be determined");
        msg += "\nSalary: $" + ((salary != 0.0) ? salary : "Salary to be determined");


        return msg;
    }
}
