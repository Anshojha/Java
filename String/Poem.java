
import java.util.Scanner;

public class Poem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the favourit poem :");
        String name = scanner.next();
        String quote = scanner.nextLine().trim();
        System.out.println("Your favourit poem is : " + name + " " + quote);
        System.out.println(name + " said, \"" + quote + "\"");
    }
}
