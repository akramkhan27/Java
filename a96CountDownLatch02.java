import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// CountDownLatch is a synchronization aid that allows one or more threads 
// to wait until a set of operations being performed by other threads complete.

//  Initialize with a count – The count represents the number 
// of tasks that must complete before proceeding.
//  Threads wait until count reaches zero – A waiting thread 
// will block until all required tasks finish.
//  One-time use – Once the count reaches zero, it cannot be 
// reset (for reusable behavior, use CyclicBarrier).

// 1 The main thread creates a CountDownLatch with a count of 3.
// 2 Three worker threads start, each performing some work (Thread.sleep()).
// 3 Each worker calls latch.countDown() when done, reducing the count.
// 4 The main thread waits using latch.await() until all workers finish (count reaches 0).
// 5 Once all workers finish, the main thread resumes execution.

// new CountDownLatch(int count)-	Creates a latch with an initial count.
// countDown()-	Decreases the count by 1.
// await()-	Blocks the calling thread until count reaches 0.
// await(long time, TimeUnit unit)-	Waits for a limited time before resuming.
// Timeout with await()
// 🔹 If workers don't finish within the time limit, the main thread proceeds anyway.
public class a96CountDownLatch02 {
    public static void main(String[] args) {
        int numberOfService=3;
        ExecutorService executorService= Executors.newFixedThreadPool(numberOfService);
        CountDownLatch countDownLatch= new CountDownLatch(numberOfService);

        executorService.submit(new DependentService(countDownLatch));
        executorService.submit(new DependentService(countDownLatch));
        executorService.submit(new DependentService(countDownLatch));

        try{
            // countDownLatch.await();
            countDownLatch.await(5,TimeUnit.SECONDS);
        }
        catch(Exception e){
            System.out.println(e);
        }
        executorService.shutdown();
        System.out.println("Other service started");
    }
}

class DependentService implements Callable<String>{
    private final CountDownLatch latch;
    public DependentService(CountDownLatch latch){
        this.latch=latch;
    }
    @Override
    public String call() throws Exception{
        try{
            // Thread.sleep(1000);
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName()+" Service started");
        }
        finally{
            latch.countDown();
        }
        return "Hello";
    }
}
