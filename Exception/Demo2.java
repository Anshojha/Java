public class Demo2 {
    public static void main(String[] args) {
        int i = 2;
        int j = 18;

        int nums[] = new int[6];

        try {
            j = 18 / i;
            System.out.println(nums[0]);
            System.out.println(nums[6]);
        } catch (ArithmeticException e) {
            System.out.println("No division possibe !!!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Access in your limit");
        } 
        catch (Exception e) { // This will handel all the execpion 
            System.out.println("Somthing went wrong!!");
        }

        System.out.println(i);
        System.out.println(j);
    }
}
