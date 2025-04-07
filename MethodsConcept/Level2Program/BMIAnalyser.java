
import java.util.Scanner;

public class BMIAnalyser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [][] data = new double[10][3];

        for(int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Height (m): ");
            data[i][1] = scanner.nextDouble(); 
        }

        calculateBMI(data);

        String[] status = getBMI(data);

        System.out.printf("\n%-10s%-12s%-10s%-15s\n", "Weight", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f%-12.2f%-10.2f%-15s\n", data[i][0], data[i][1] * 100, data[i][2], status[i]);
        }
     }

     public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = weight / (weight * height);
            data[i][2] = bmi;        }
     }

     public static String[] getBMI(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if( bmi < 18.5) {
                status[i] = "Underweight";
            }
            else if (bmi > 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            }
            else if (bmi > 25 && bmi < 29.9) {
                status[i] = "Overweight";
            }
            else if (bmi > 30) {
                status[i] = "Obesity";
            }
            else {
                status[i] = "Invalid BMI";
            }
            if (bmi < 0) {
                status[i] = "Invalid BMI";
            }
        }
        return status;
     }
}
