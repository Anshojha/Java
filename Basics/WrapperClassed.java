public class WrapperClassed {
    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(8); // Given warning as decpricate class
        // Integer num1 = new Integer(num); // Boxing -> assigning the primitive datatype to class based dataypes
        Integer num1 = num; // Autoboxing -> Automatically converting to object based 
        // int num2 = num1.intValue(); // unboxing as opposite to the boxing
        int num2 = num1; // AutoUnboxing 

        // System.out.println(num);
        System.out.println(num2);

        String str = "12";

        int num3 = Integer.parseInt(str); // This is also is an example of wrraper class

        System.out.println(num3 * 2);
    }
}
