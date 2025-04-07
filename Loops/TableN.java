
import java.util.Scanner;



public class TableN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", number, i , number * i);
            System.out.printf("\n");
        }
    }
}
