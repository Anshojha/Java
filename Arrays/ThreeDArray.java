
import java.util.*;



public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int depth = 4;
        int rows = 4;
        int cols = 4;

        int[][][] arr = new int[depth][rows][cols];

        System.out.println("--------- Enter the value of the 3D arrays ----------");

        for(int i = 0; i < depth; i++) {
            for(int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.println("Enter value for arr[" + i + "][" + j + "][" + k + "]:  ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("\n Printing values in 3D array. ");
        for(int i = 0; i < depth; i++) {
            System.err.println("Table " + (i + 1) + ":");
            for(int j = 0; j < rows; j++) {
                for(int k = 0; k < cols; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.err.println();
        }

        sc.close();
    }
    
}
