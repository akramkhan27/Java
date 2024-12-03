// trylock()

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

class BankAccount{
    private int balance=100;
    private final Lock lock=new ReentrantLock();
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to qithdraw");
        if(lock.tryLock()){
            if(balance>=amount){
                try{
                System.out.println(Thread.currentThread().getName()+" processing with withdrawal");
                Thread.sleep(5000);
                balance-=amount;
                System.out.println(Thread.currentThread().getName()+" succefull withdrawal. Remaining Balance: "+balance);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                finally{
                    lock.unlock();
                }
            }
            else{
                System.out.println(Thread.currentThread().getName()+" insufficient balance");
            }
        }
        else{
            System.out.println("Lock is not available");
        }
    }
}
public class a75Locks {
    public static void main(String[] args) {
        BankAccount sbi =new BankAccount();

        Runnable task=new Runnable(){
            @Override
            public void run(){
                sbi.withdraw(50);
            }
        };

        Thread t1=new Thread(task, "Akram");
        Thread t2=new Thread(task, "Marka");

        t1.start();
        t2.start();
    }
}
