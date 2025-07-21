
import java.io.IOException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws IOException  {
        System.out.println("Hello");
        
        // InputStreamReader in =new  InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine( ));
        // System.out.println(num);
        // The above line of code used before 5 java version 



        // The scanner class is used in taking input after the 5+ version of Jav
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
