
import java.util.Scanner;



public class FootBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int [] heightData = new int[11];

        for(int i = 0; i < 11; i++) {
            System.err.println("Enter the height of player " + (i + 1) + ": ");
            heightData[i] = scanner.nextInt();
        }

        System.err.println("The height of the players are: ");
        for(int i = 0; i < 11; i++) {
            System.out.println("Player " + (i + 1) + ": " + heightData[i] + " cm");
        }

        System.out.println("The sum of the heights of the players is: " + calaculateSum(heightData) + " cm");
        System.out.println("The minimum height of the players is: " + getMin(heightData) + " cm");
        System.out.println("The maximum height of the players is: " + getMax(heightData) + " cm");
        System.out.println("The mean height of the players is: " + getMean(heightData) + " cm");

    }

    public static int calaculateSum (int [] heightData) {
        int sum = 0;

        for(int i = 0; i < heightData.length; i++) {
            sum += heightData[i];
        }
        return sum;
    }

    public static int getMin(int [] heightData) {
        int min = heightData[0];

        for(int i = 1; i < heightData.length; i++) {
            if(heightData[i] < min) {
                min = heightData[i];
            }
        }
        return min;
    }
    public static int getMax(int [] heightData) {
        int max = heightData[0];

        for(int i = 1; i < heightData.length; i++) {
            if(heightData[i] > max) {
                max = heightData[i];
            }
        }
        return max; 
    }

    public static int getMean(int [] heightData) {
        int sum = 0;
        for(int i = 0; i < heightData.length; i++) {
            sum += heightData[i];
        }
        return sum / heightData.length;
    }
}
