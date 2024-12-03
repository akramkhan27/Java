// ReentrantLock
// Allows the same thread to acquire the lock multiple times without
//  causing a deadlock. (with synchronized we can also achieve reentracy)

// lock and unlock number should be same or paired in ReentractLock

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockExample{
    private final Lock lock =new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }
        finally{
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        }
        finally{
            lock.unlock();
            // lock.unlock();
        }
    }
}
public class a77ReentrantLock {
    public static void main(String[] args) {
        ReentrantLockExample r1=new ReentrantLockExample();
        r1.outerMethod();
    }
}
