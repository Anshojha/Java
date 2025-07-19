interface  Computer {
    void code();
}

class Laptop implements Computer {
    public void code () {
        System.out.println("Code...  -> Compile....  -> Run......");
    }
}

class Desktop implements Computer {
    public void  code () {
        System.out.println("Code...... -> Complie..... -> Run........ || Faster");
    }
}

class Develoer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        Develoer ansh = new Develoer();

        ansh.devApp(desk);

    }
}
