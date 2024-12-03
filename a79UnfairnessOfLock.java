// Fairness in Locks

// In Java, fairness determines how a lock is allocated among competing 
// threads. A fair lock ensures that threads acquire the lock in the 
// order they requested it (FIFO). 

// On the other hand, an unfair lock 
// does not guarantee this order and may allow a thread to "bypass" 
// others waiting in line, which can lead to thread starvation.

// Unfainess Example

// suppose we have thousand of numbers of thread where one thread
// is not getting chance to execute this can cause starvation. 
// This will overcome by fairness lock. where in ReentrantLock
// constructor pass true.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class UnfairLockExample{
    private final Lock unfairLock =new ReentrantLock();

    public void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+"Acquired the lock");
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
        finally{
            System.out.println(Thread.currentThread().getName()+"Release the lock");
            unfairLock.unlock();
        }

    }
}
public class a79UnfairnessOfLock {
    public static void main(String[] args) {
        UnfairLockExample res=new UnfairLockExample();

        Runnable task= new Runnable(){
            @Override
            public void run(){
                res.accessResource();
            }
        };

        Thread t1=new Thread(task,"Akram");
        Thread t2=new Thread(task, "Marka");
        Thread t3=new Thread(task, "Ahmad");

        t1.start();
        t2.start();
        t3.start();
    }
}
