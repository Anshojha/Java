
enum Status {
    Running, Pending, Failed, Success;
}


public class Demo2 {
    public static void main(String[] args) {
        Status s = Status.Failed;

        switch (s) {
            case Running:
                System.out.println("I am in running state");
                break;
            case Pending:
                System.out.println("I am in pending state");
                break;
            case Failed:
                System.out.println("I am in failed state");
                break;
            case Success:
                System.out.println("I am in succcess state");
            default:
                throw new AssertionError();
        }
    }
}
