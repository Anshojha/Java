
import java.util.Scanner;

public class UnitConverter {
    public double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        Double km = scanner.nextDouble();
        UnitConverter converter = new UnitConverter();
        double miles = converter.convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
        scanner.close();
    }
}
