import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// problem
// If we have many task which are going to execute by threads then we have 
// to right many get() so that all threads run first then remaining doing 
// done by main thread because all that remained one which are executed 
// by main thread is dependent on the custom threads doing the task

// as we can also use get() as for solution
// join while creating Thread with new Thread()
// but as Task grow then get() or join() will also grow
// So that's why countDownLatch came to picture

public class a95CountDownLatch01 {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        Future<String> future1=executorService.submit(new DependentThread());
        Future<String> future2=executorService.submit(new DependentThread());
        Future<String> future3=executorService.submit(new DependentThread());

        future1.get();
        future2.get();
        future3.get();

        executorService.shutdown();
        // remaining doing which are dependent upon threads to execute above task first

        System.out.println("All dependent service executed. starting main service");
    }
}
class DependentThread implements Callable<String>{
    @Override
    public String call () throws Exception{
        System.out.println(Thread.currentThread().getName()+" service started");
        Thread.sleep(1000);
        return "Hello";
    }
}
