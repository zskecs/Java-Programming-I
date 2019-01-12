
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;

    public Library() {
        book = new ArrayList();
    }

    public void addBook(Book newBook) {
        book.add(newBook);

    }

    public void printBooks() {

        for (Book b : book) {
            System.out.println(b);
        }

    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book b : book) {
           if(StringUtils.included(b.title(), title)) {
                found.add(b);
            }
            
            

        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {

        ArrayList<Book> found = new ArrayList<Book>();

        for (Book b : book) {
             if(StringUtils.included(b.publisher(), publisher)){
                found.add(b);
            }
            

        }
        return found;

    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book b : book) {

            int c = b.year();
            if (c == year) {
                found.add(b);
            }

        }
        return found;
    }

}
