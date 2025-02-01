// 1. Intrinsic Locks
// Definition: These locks are built into every Java object and are automatically 
// used when you use the synchronized keyword.
// How It Works:
// When a thread enters a synchronized block or method, it acquires the intrinsic 
// lock of the object.
// Other threads trying to access synchronized code must wait until the lock is released.

// 2. Explicit Locks
// Definition: These are more advanced locks provided by the java.util.concurrent.locks package.
// How It Works:
// You manually control when to lock and unlock.
// This gives greater flexibility and prevents issues like deadlocks or contention.

// In Java, Locks provide a more advanced mechanism for thread synchronization 
// compared to synchronized. They belong to the java.util.concurrent.locks 
// package and allow for more flexible and controlled locking mechanisms.

// Why Use Locks Instead of Synchronized?
// Fine-grained control: Locks allow for more granular control over thread synchronization.
// Try-lock: You can attempt to acquire a lock without blocking indefinitely.
// Interruptibility: A thread can be interrupted while waiting for a lock.
// Fairness: Locks can ensure fairness by granting access to the longest-waiting thread.
// Types of Locks

// ReentrantLock

// Most commonly used.
// Allows the same thread to acquire the lock multiple times without causing a deadlock.
// Part of the java.util.concurrent.locks package.

// ReadWriteLock

// Divides access into read and write locks.
// Multiple threads can hold the read lock simultaneously if no thread holds the write lock.

// ReentrantLock Example
// ReentrantLock is a lock that can be used in place of synchronized for critical sections.

// lock.lock(): Acquires the lock before executing the critical section. 
    // - thread wait for lock as same as synchronized
// tryLock(): lets you attempt to acquire the lock without blocking indefinitely. 
    // -thread wait only the given time or exit 
// lock.unlock(): Releases the lock, allowing other threads to proceed. 
    // -unlock the lock
// try-finally: Ensures the lock is released even if an exception occurs.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class BankAccount{
    private int balance=100;

    private final Lock lock = new ReentrantLock();

    // public synchronized void withdraw(int amount){
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw");
        lock.lock(); // Acquire the lock
        if(balance>=amount){
            try{
                System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal");
                Thread.sleep(5000);
                balance-=amount;
                System.out.println(Thread.currentThread().getName()+" completed withdrawal. Remaining Balance : "+balance);
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                lock.unlock(); // Always release the lock in a finally block
            }

        }
        else{
            System.out.println(Thread.currentThread().getName()+" have insufficient balance");
        }
    }
}
public class a74Locks {
    public static void main(String[] args) {
        BankAccount sbi= new BankAccount();

        Runnable task = new Runnable(){
            @Override
            public void run(){
                sbi.withdraw(50);
            }
        };

        Thread t1=new Thread(task, "Akram");
        Thread t2=new Thread(task, "marka");

        t1.start();
        t2.start();
    }
}
