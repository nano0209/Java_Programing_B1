package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        //this book object can reach 6 instances


        EBook eBook = new EBook();


        eBook.size = 20;
        eBook.pages = 1035;
        eBook.title = "Soft Skill";
        eBook.author = "Nadir";
        eBook.read();

        AudioBook ebook = new AudioBook();

    }
}
