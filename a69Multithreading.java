// SetPriority()
// The setPriority() method in Java is used to assign a priority level to a thread. 
// Thread priorities determine the importance of a thread relative to other threads. 
// However, thread scheduling is platform-dependent, and the priority might not always 
// affect the execution order.

// Key Points about setPriority()
// Range: Thread priority values range from 1 (minimum priority) to 10 (maximum priority).
// Thread.MIN_PRIORITY = 1
// Thread.NORM_PRIORITY = 5 (default priority)
// Thread.MAX_PRIORITY = 10
// Default Priority: A thread inherits the priority of the thread that creates it.
// Effect: Priority indicates the likelihood of a thread getting CPU time, but it 
// doesn't guarantee execution order.

class Test extends Thread{
    public Test(String name){
        super(name);
    }

    @Override 
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+i);
        }
    }
}
public class a69Multithreading {
    public static void main(String[] args) {
        Test t1=new Test("Akram");
        Test t2=new Test("Marka");
        Test t3=new Test("Miya");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

// What is the default priority of a thread?
// The default priority is 5, which corresponds to Thread.NORM_PRIORITY.

// What happens if a thread's priority is set outside the range of 1 to 10?
// An IllegalArgumentException is thrown.

// Does thread priority guarantee execution order?
// No, thread priority is only a suggestion to the thread scheduler. 
// Execution order depends on the JVM and the operating system.