import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class a92ExecutorFrameWork05 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // invokeAll() without time
        Callable<Integer> callable1= ()->
        {
        System.out.println("Task 1");
        return 1;
        };
        Callable<Integer> callable2= ()->{
        System.out.println("Task 2");
        return 2;
        };
        Callable<Integer> callable3= ()->{
        System.out.println("Task 3");
        return 3;
        };
        List<Callable<Integer>> callables =Arrays.asList(callable1,
        callable2,callable3);
        try{
        List<Future<Integer>> futures=executor.invokeAll(callables);
        for(Future<Integer> future: futures){
        System.out.println(future.get());
        }
        executor.shutdown();
        }
        catch(Exception e){
        System.out.println(e);
        }

        // invokeAll() executes multiple Callable<T> tasks in parallel
        // and returns a list of Future<T> results.
        // It blocks until all tasks are completed.
        // Used when you want to execute multiple tasks and wait for their results.

        // invokeAll() with Time
        // Callable<Integer> callable1 = () -> {
        // Thread.sleep(1000);
        // System.out.println("Task 1");
        // return 1;
        // };
        // Callable<Integer> callable2 = () -> {
        // Thread.sleep(1000);
        // System.out.println("Task 2");
        // return 2;
        // };
        // Callable<Integer> callable3 = () -> {
        // Thread.sleep(1000);
        // System.out.println("Task 3");
        // return 3;
        // };
        // List<Callable<Integer>> callables = Arrays.asList(callable1, callable2,
        // callable3);
        // List<Future<Integer>> futures = null;
        // try {
        // futures = executor.invokeAll(callables, 3, TimeUnit.SECONDS);
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // for (Future<Integer> future : futures) {
        // try {
        // System.out.println(future.get());
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // }
        // executor.shutdown();
        // System.out.println("Hello");

        // If a task finishes before the timeout, future.get() returns the result.
        // If a task exceeds the timeout, it gets canceled automatically.

        // invokeAny() with Timeout
        // The invokeAny() method is used when you want the result of the first
        // successfully completed task while canceling all remaining tasks.

        // Returns the first successfully completed task’s result.
        // Cancels remaining tasks automatically after the first successful completion.
        // Throws TimeoutException if no task completes within the timeout.

        // Callable<Integer> callable1 = () -> {
        //     Thread.sleep(1000);
        //     System.out.println("Task 1");
        //     return 1;
        // };
        // Callable<Integer> callable2 = () -> {
        //     Thread.sleep(1000);
        //     System.out.println("Task 2");
        //     return 2;
        // };
        // Callable<Integer> callable3 = () -> {
        //     Thread.sleep(1000);
        //     System.out.println("Task 3");
        //     return 3;
        // };
        // List<Callable<Integer>> callables = Arrays.asList(callable1, callable2, callable3);
        // Integer future = null;
        // try {
        //     future = executor.invokeAny(callables, 2, TimeUnit.SECONDS);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        
        // try {
        //     System.out.println(future);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // executor.shutdown();
        // System.out.println("Hello");

    }
}

// Difference Between invokeAll() and invokeAny()
// Feature invokeAll() invokeAny()
// Returns List of Future<T> (all results) A single result from the fastest task
// Execution Waits for all tasks Returns after the first successful task
// to complete (or timeout)
// Cancellation Doesn't cancel other tasks Cancels remaining tasks once one
// completes
// Timeout Skips timed-out tasks but Throws TimeoutException if no task
// completes within time
// Handling still collects others
