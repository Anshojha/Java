



public class StringBuffers {

    public static void main(String[] args) {
        // 1. Create a StringBuffer
        StringBuffer str = new StringBuffer("How");
        
        // 2. Append - add text at the end
        str.append(" old");
        System.out.println("After append: " + str);

        // 3. Insert - insert text at a specific position
        str.replace(0, 5, "What");
        System.out.println("After replacing : " + str);

        // 5. Removing charachter from 0, 4
        str.delete(0, 3);
        System.out.println("After deleting : " + str);

        str.reverse();
        System.out.println("After reverse: " + str); // dlroW iH

        System.out.println("Length" + str.length());

        System.out.println("Capacity :" + str.capacity());

        System.out.println("CharAt" + str.charAt(7));

        String str1 = str.toString();
        System.out.println("Regular strung :" + str1);;


    }

}
