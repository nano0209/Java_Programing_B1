package day43_map;

public class Student {
    String name;
    double gpa;
    int id;

    public Student(String name, double gpa, int id) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Student" +
                "\nname: " + name+
                "\nID: " + id+
                "\nGP: " + gpa;

    }
}
