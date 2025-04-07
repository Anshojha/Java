
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class User {
    public String name;
    public LocalDate dob;
    public ArrayList<Book> books = new ArrayList<Book>();

    public void burrow (Book book) {
        this.books.add(book);
    }

    public int age () {
        int age = Period.between(this.dob, LocalDate.now()).getYears();
        return age;
    }
}
