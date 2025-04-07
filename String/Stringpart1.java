class Stringpart1 {
    public static void main(String [] argss) {
        // String name = "Amul Kakkar";  String Literal	String Pool (Heap)	Reuses existing string if available
        
        String name = new String("Amul kakkar");  // new Keyword	Heap Memory	Always creates a new object

        System.out.println(name);
    }
}