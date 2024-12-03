// What is ReadWriteLock in Java?

// ReadWriteLock is a part of the java.util.concurrent.locks package. 
// It allows multiple threads to read data simultaneously but restricts 
// write access to only one thread at a time. This improves performance 
// when there are more readers than writers.

// Why Use ReadWriteLock?
// In cases where read operations are frequent and write operations are rare.
// Allows multiple threads to read the resource at the same time, but if a 
// thread wants to write, it blocks all readers and other writers.

// Types of Locks in ReadWriteLock
// Read Lock:
// Multiple threads can acquire the read lock simultaneously.
// Blocks if a write lock is held by another thread.

// Write Lock:
// Only one thread can acquire the write lock at a time.
// Blocks all readers and other writers while held.

// Common Implementation: ReentrantReadWriteLock
// The ReentrantReadWriteLock is the most commonly used implementation 
// of ReadWriteLock.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWrite{
    private int count=0;

    private final ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    private final Lock read= readWriteLock.readLock();
    private final Lock write= readWriteLock.writeLock();

    public void increment(){
        write.lock();
        try{
            count++;
        }
        finally{
            write.unlock();
        }
    }

    public int getCount(){
        read.lock();
        try{
            return count;
        }
        finally{
            read.unlock();
        }
    }
}
public class a81ReadWriteLock {
    public static void main(String[] args) throws InterruptedException {
        ReadWrite res=new ReadWrite();

        Runnable readTask=new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<=5;i++){
                    System.out.println(Thread.currentThread().getName()+ " Reading : "+res.getCount());
                }
            }
        };
        Runnable writeTask=new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<=5;i++){
                    res.increment();
                    System.out.println(Thread.currentThread().getName()+ " Incremented : "+res.getCount());
                }
                
            }
        };

        Thread t1= new Thread(readTask,"Akram");
        Thread t2= new Thread(readTask,"Marka");
        Thread t3= new Thread(writeTask,"Me");
        Thread t4= new Thread(writeTask,"You");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Final Count : "+res.getCount());
    }
}
