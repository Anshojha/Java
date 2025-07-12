


public class TwoD {
    public static void main(String[] args) {
        int[][] numsArrar = new int[5][8];
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 8; j++) {
                numsArrar[i][j] = (int)(Math.random()*10);
            }
        }


        for(int n[] : numsArrar) {
            for(int m : n) {
                System.out.print(m  +" ");
            }
            System.err.println("");
        }
        
    }
}
