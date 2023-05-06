package day39_a_polymorphism.book;

/*
Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
 */
public class JavaTextBook extends EBook {

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading");
    }

    @Override
    public void downloadable() {
        System.out.println("Downloading");
    }

    @Override
    public void open() {
        System.out.println("Opening");
    }
}
