

class Pen {
    public synchronized void writeWithPenAndPaper ( Paper paper ) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " ans trying to access " + paper.finishWriting());
        
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finishws using pen " + this);
    }
}


class Paper {
    public synchronized void writeWithPaperAndPen ( Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to access " + pen.finishWriting());
    }

    public synchronized void finishWriting () {

    }
}



public class DeadLockExample {
    
}
