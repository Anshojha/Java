
enum Status {
    Running, Failed, Pending, Success;
}

public class Demo1 {

    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Failed;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss = Status.values();

        System.out.println(ss[1]);

        for (Status sa : ss) {
            System.out.println(sa + " : " + sa.ordinal());
        }
    }
}
