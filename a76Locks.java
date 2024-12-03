// trylock() with time
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount{
    private int balance=100;
    private final Lock lock =new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw");
        try{
            if(lock.tryLock(5100,TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try{
                        System.out.println(Thread.currentThread().getName()+" processing with withdrawal");
                        Thread.sleep(5000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName()+" succesfull withdrawal. Remaining Balance: "+balance);
                    }
                    catch(Exception e){
                        System.out.println(e);
                        Thread.currentThread().interrupt();
                    }
                    finally{
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" infuccient Balance");
                }
            }
            else{
                System.out.println("Lock is not available");
            }
        }
        catch(Exception e){
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
    }
}
public class a76Locks {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
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
