// fairness in lock Example
// in these every threads get chance to execute


// Feature	                Fair Lock	                                    Unfair Lock
// Acquisition              Order Threads acquire the lock in FIFO order.	Threads acquire the lock without order.
// Starvation	            Prevents thread starvation.	                    May cause thread starvation.
// Performance	            Slower due to maintaining the queue.	        Faster because it avoids managing a queue.
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FairnessExample{
    private final Lock fairnessLock=new ReentrantLock(true);

    public void accessResource(){
        fairnessLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" access resource");
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
        finally{
            System.out.println(Thread.currentThread().getName()+" release the lock");
            fairnessLock.unlock();
        }
    }
}
public class a80FairnessOfLock {
    public static void main(String[] args) {
        FairnessExample res=new FairnessExample();
        Runnable task=new Runnable(){
            @Override 
            public void run(){
                res.accessResource();
            }
        };

        Thread t1=new Thread(task,"A");
        Thread t2=new Thread(task,"B");
        Thread t3=new Thread(task,"C");

        t1.start();
        t2.start();
        t3.start();
    }
}
