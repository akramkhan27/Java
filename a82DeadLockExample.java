// What is Deadlock in Java?
// A deadlock occurs when two or more threads are waiting for each other 
// to release resources, but none of them ever does, causing the program 
// to freeze. Deadlocks are a common issue in multithreading when threads 
// try to acquire multiple locks simultaneously.

// Example of Deadlock
// Imagine two threads and two locks (lock1 and lock2).

// Thread 1 holds lock1 and waits for lock2.
// Thread 2 holds lock2 and waits for lock1.
// Neither thread can proceed because they are waiting on each other.

// 1. Intrinsic Locks
// Definition: These locks are built into every Java object and are automatically 
// used when you use the synchronized keyword.
// How It Works:
// When a thread enters a synchronized block or method, it acquires the intrinsic 
// lock of the object.
// Other threads trying to access synchronized code must wait until the lock is released.

class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" is using pen and trying to write");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished using pen ");
    }
}

class Paper{
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" is using paper and trying to write");
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished using paper ");
    }
}

class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;
    public Task1(Pen pen, Paper paper){
        this.pen=pen;
        this.paper=paper;
    }
    @Override
    public void run(){
        pen.writeWithPenAndPaper(paper); // Thread1 lock pen and tries to lock paper
    }
}
class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;
    public Task2(Pen pen, Paper paper){
        this.pen=pen;
        this.paper=paper;
    }
    @Override
    public void run(){
        synchronized(pen){
            paper.writeWithPaperAndPen(pen); // first lock pen than go for paper lock -- deadlock issue resolved
        }
        // paper.writeWithPaperAndPen(pen); // Thread2 lock paper and tries to lock pen
    }
}
public class a82DeadLockExample {
    public static void main(String[] args) {
        Pen pen =new Pen();
        Paper paper= new Paper();

        Thread t1=new Thread(new Task1(pen, paper),"thread-1" );
        Thread t2=new Thread(new Task2(pen, paper),"thread-2");

        t1.start();
        t2.start();
    }
}

// In this program, deadlock happens because:

// Thread-1:
// Acquires the pen lock (enters the writeWithPenAndPaper() method of the Pen object).
// Tries to acquire the paper lock by calling paper.finishWriting(), which is already held by Thread-2.

// Thread-2:
// Acquires the paper lock (enters the writeWithPaperAndPen() method of the Paper object).
// Tries to acquire the pen lock by calling pen.finishWriting(), which is already held by Thread-1.
// Deadlock Scenario
// Both threads are now stuck waiting for each other to release their respective locks. 
// This is the deadlock, and the program freezes at this point.