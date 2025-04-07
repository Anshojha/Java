class Stringpart2 {
    public static void main (String [] args) {
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objString1 = new String("xyx");
        String objString2 = new String("xyx");

        System.out.println(literalString1 == literalString2);
        System.out.println(objString1 == objString2);
        
    }
}