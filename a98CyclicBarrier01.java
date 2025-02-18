import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// CyclicBarrier is a synchronization mechanism that allows multiple 
// threads to wait for each other at a common barrier point before 
// continuing execution.

// Unlike CountDownLatch, CyclicBarrier is reusable, meaning 
// once the barrier is released, it can be used again.

// Key Features of CyclicBarrier
//  Synchronizes multiple threads at a barrier point.
//  Reusable after all threads reach the barrier.
//  Can execute a Runnable action after the last thread arrives.

// Explanation
// 1 Create a CyclicBarrier with 3 as the number of threads.
// 2 Define a barrier action (Runnable) that executes when all threads reach the barrier.
// 3 Each worker thread:

// Performs some work (Thread.sleep(2000)).
// Calls barrier.await() to wait for others.
// Once all workers reach the barrier, the barrier action executes.
// Then, all threads proceed to the next phase.

// Important Methods
// Method	Description
// CyclicBarrier(int parties)	
// Creates a barrier for the given number of threads.
// CyclicBarrier(int parties, Runnable action)	
// Runs an action when all threads reach the barrier.
// await()	
// Waits for other threads to reach the barrier.
// await(long timeout, TimeUnit unit)	
// Waits with a timeout.
// reset()	
// Resets the barrier for reuse.


// Example: Using reset()
//  If threads fail to reach the barrier, reset() can be used to restart the process.
// barrier.reset();

//  Real-World Use Cases
//  Parallel Processing – Dividing a task into phases where all 
//  threads must sync before moving to the next step.
//  Multiplayer Gaming – Waiting for all players to be ready 
//  before starting the next round.
//  Batch Processing – Ensuring all data chunks are processed 
//  before proceeding.

//  Used for synchronizing multiple threads at a barrier.
//  Reusable – Unlike CountDownLatch, it can be reset.
//  Barrier action executes when all threads arrive.

public class a98CyclicBarrier01 {
    public static void main(String[] args) {
        int numberOfService = 3;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(numberOfService);
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfService);
        executorService.submit(new DependentService(cyclicBarrier));
        executorService.submit(new DependentService(cyclicBarrier));
        executorService.submit(new DependentService(cyclicBarrier));

        executorService.shutdown();
        System.out.println("Other service started");

    }
}

class DependentService implements Callable<String> {
    CyclicBarrier cyclicBarrier;

    public DependentService(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+" is waiting at Barrier");
        cyclicBarrier.await();
        return "Ok";
    }
}
     