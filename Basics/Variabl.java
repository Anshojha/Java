  class Variabl {
    public static void main(String[] args) {
        // int 0age  variable name can't start with a number
        // int my age = 23; variable name can't have space
        // int $age = 23; variable name can't start with a special character
        // int myAge = 23; // correct
        // int a = 23; // correct
        // int _age = 23; // correct
        // there are 50 reserved keywords in Java cannot be used as a variable name 
        // byte age = 23; // 1 byte
        // short aSmallNumber = 23; // 2 bytes -128 to 127
        // int aNumber = 23; // 4 bytes -2,147,483,648 to 2,147,483,647
        // long aLargeNumber = 23; // 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // double aDouble = 23.0; // 8 bytes 4.9e-324 to 1.8e+308
        // float aFloat = 23.0f; // 4 bytes 1.4e-045 to 3.4e+038
        // char aCharacter = 'A'; // 2 bytes 0 to 65,535
        // boolean isWeekend = true; // 1 bit true or false
        // boolean isWeekday = false; // 1 bit true or false

        char copyRight = '\u00A9'; // unicode character
        System.out.println("Copy right symbol: " + copyRight);
    }
}