import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// ScheduledExecutorService is a part of the Executor framework in Java 
// that allows us to schedule tasks to run after a delay or at a fixed rate/interval.

// It provides better performance than using Timer and Thread.sleep() for scheduling tasks.
public class a93ExecutorFrameWork06 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler= Executors.newScheduledThreadPool(1);
        // scheduler.schedule(()->{
        //     System.out.println("Hello");
        // }, 3, TimeUnit.SECONDS);

        // scheduler.scheduleAtFixedRate(()->{
        //     System.out.println("Hello");
        // }, 5, 5, TimeUnit.SECONDS);
        // scheduler.scheduleWithFixedDelay(()->{
        //     System.out.println("Hello");
        // }, 5, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture= scheduler.scheduleWithFixedDelay(()->{
            System.out.println("Hello");
        }, 5, 5, TimeUnit.SECONDS);
        scheduler.schedule(()->{
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
        
    }
}
// schedule() – One-time Execution
// 🔹 This schedules a task to run once after a delay.

// scheduleAtFixedRate() – Fixed Rate Execution
// 🔹 Runs a task at a fixed rate, even if the previous execution takes time.
// 🔹 If the task execution takes longer than the interval, it may overlap.

// scheduleWithFixedDelay() – Fixed Delay Execution
// 🔹 Waits for the previous execution to complete, then starts a new one after the delay.
// 🔹 Ensures tasks do not overlap.

// Method	Description
// schedule(Runnable command, long delay, TimeUnit unit)	
// Runs a task after a specified delay.
// schedule(Callable<V> callable, long delay, TimeUnit unit)	
// Runs a task that returns a result after a delay.
// scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)	
// Runs a task periodically at a fixed rate (ignoring execution time).
// scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)	
// Runs a task periodically with a fixed delay (waiting for the previous task to finish).
