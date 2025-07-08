class Movie {
    String title;
    String director;
    int releaseYear;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.next = null;
        this.prev = null;
    }

}

class MovieList {
    Movie head;
    Movie tail;

    void addFirst(String title, String director, int releaseYear) {
        Movie newMovie = new Movie(title, director, releaseYear);
        if(head == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    void addLast(String title, String director, int releaseYear) {
        Movie newMovie = new Movie(title, director, releaseYear);
        if(head == null) {
            head = newMovie;
            tail = newMovie;
        }
        else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    void addAtPos(int pos, String title, String director, int releaseYear) {
        if(pos < 0) {
            System.out.println("Invalid position");
            return;
        }
        if(pos == 0) {
            addFirst(title, director, releaseYear);
            return;
        }
        Movie newMovie = new Movie(title, director, releaseYear);
        Movie current = head;
        for(int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if(current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newMovie.next = current.next;
        newMovie.prev = current;
        if(current.next != null) {
            current.next.prev = newMovie;
        } else {
            tail = newMovie; // Update tail if adding at the end
        }
        current.next = newMovie;
    }

    void removeByTitle(String toTitle) {
        if(head == null) {
            System.err.println("List is empty");
            return;
        }
        Movie current = head;
        while(current != null) {
            if(current != null && !current.title.equalsIgnoreCase(toTitle)) {
                current = current.next;
            }
            if(current == null) {
                System.out.println("Movie not found");
                return;
            }
            if(current == head) {
                head = current.next;
            }
            if(current == tail) {
                tail = current.prev;
            }
            if(current.prev != null) {
                current.prev.next = current.next;
            }
            if(current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    void displayForward() {
        System.out.println("Movies (Forward):");
        for (Movie m = head; m != null; m = m.next)
            System.out.println(m.title + " | " + m.director + " | " + m.releaseYear + " | " );
    }
    void displayBackward() {
        System.out.println("Movies (Backward):");
        for (Movie m = tail; m != null; m = m.prev)
            System.out.println(m.title + " | " + m.director + " | " + m.releaseYear + " | ");
    }
   


}
public class MovieManager {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addLast("Inception", "Nolan", 2010);
        list.addFirst("The Matrix", "Wachowski", 1999);
        list.addAtPos(2, "Interstellar", "Nolan", 2014);

        list.displayForward();
        list.displayBackward();
     

        list.removeByTitle("The Matrix");
        list.displayForward();
    }
}
