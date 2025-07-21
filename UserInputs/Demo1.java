
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // int num = 0;
        // BufferedReader br = null;
        // try{
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(in);
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        // finally {
        //     // System.out.println("Finally Block");
        //     br.close();
        // }
        // int num = 0;
        // BufferedReader br = null;
        // try{
        //     br = new BufferedReader( new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        // finally {
        //     // System.out.println("Finally Block");
        //     br.close();
        // }
        // Now the blow code will close the resource automatically this is called try with resources

                int num = 0;
      
        try(BufferedReader br = new BufferedReader( new InputStreamReader(System.in));){
            
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        
    }
}
