
class CustomException extends Exception{

    public CustomException(String mes) {
        super(mes);
    }
    
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());

        }
    }

    public static void validate(int age) throws CustomException {
        if(age < 18) {
            throw  new CustomException("Age is not just a number"); 
        }
    }
}
