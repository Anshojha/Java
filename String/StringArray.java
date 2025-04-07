
import java.util.Scanner;

public class StringArray {
    public static  void main(String [] args) {
        String [] rollNumbers ={"001", "002", "003", "004"};
        Scanner input = new Scanner(System.in);
        String [] names = new String[4];
        System.out.println("Enter the names of the students: ");
        for(int i = 0; i < 4; i++) {
            names[i] = input.nextLine();
        }

        int i = 0;

        for(String name : names) {
            System.out.println("Name: " + name + "\t Roll Number: "
 				    + rollNumbers[i++]);

        }


    }
}
