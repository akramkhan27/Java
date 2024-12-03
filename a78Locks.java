// lockInterruptibility()
// lockInterruptibly() is a method in the ReentrantLock class. It allows 
// a thread to acquire a lock while being responsive to interruptions. This 
// means the thread can stop waiting for the lock if it gets interrupted, unlike 
// the regular lock() method, which ignores interruptions and keeps waiting.

// lock.lockInterruptibly():

// Thread-1 acquires the lock first and works for 2 seconds.
// Thread-2 tries to acquire the lock but gets interrupted before it can acquire it.
// Interrupt Handling:

// When t2.interrupt() is called, Thread-2 stops waiting and throws an InterruptedException.
// Thread-2 exits gracefully, printing a message.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw");
        try {
            lock.lockInterruptibly();
            if (balance >= amount) {
                try {
                    System.out.println(Thread.currentThread().getName() + " processing with withdrawal");
                    Thread.sleep(3000);
                    balance -= amount;
                    System.out.println(
                            Thread.currentThread().getName() + " succesfull withdrawal. Remaining Balance: " + balance);
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println(Thread.currentThread().getName());
                } finally {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName()+" released the lock");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " infuccient Balance");
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class a78Locks {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Akram");
        Thread t2 = new Thread(task, "Marka");

        t1.start();
        t2.start();

        try{
            Thread.sleep(500);
            t2.interrupt();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
