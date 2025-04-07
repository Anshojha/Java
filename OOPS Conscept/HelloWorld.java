
import java.time.LocalDate;


public class HelloWorld {
    public static void main(String[] args) {
    
        User younUser = new User();
        younUser.name = "John";
        younUser.dob = LocalDate.of(1990, 1, 1);
        System.out.println("I am a new user and my name is %s was born on %s and I am a %s year".formatted(younUser.name, younUser.dob.toString(), younUser.age()));

        // User oldUser = new User();
        // oldUser.name = "Jane";
        // oldUser.dob = LocalDate.of(1980, 1, 1);
        // System.out.println("I am a old user and my name is %s was born on %s and I am a %s year".formatted(oldUser.name, oldUser.dob.toString(), oldUser.age()));
        
        Book book = new Book();
        book.name = "Java Programming";
        book.author = "James Gosling";
        younUser.burrow(book);
        
        System.out.printf("The book %s is written by %s".formatted(book.name, book.author));
        System.out.printf("%s has burrowed the book %s", younUser.name, younUser.books.get(0).name);
    }
}
