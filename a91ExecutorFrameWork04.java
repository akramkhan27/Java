import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class a91ExecutorFrameWork04 {
    public static void main(String[] args) throws Exception {
        // ExecutorService executer = Executors.newSingleThreadExecutor();
        // Here submit callable method is running
        // Future<Integer> future=executer.submit(()->42) ; // submit callable()
        // Future<?> future=executer.submit(()-> System.out.println("Hello")); // submit
        // runnable()
        // Future<?> future=executer.submit(()-> System.out.println("Hello"), "success"
        // ); // submit runnable() with return result

        // Runnbale do no return , but callable return
        // Runnable runnable= ()->Hello; // error
        // Callable<String> callable= ()-> "Hello";
        // Here submit callable method is running
        // Future<?> future=executer.submit(callable); // submit collable()
        // try{
        // System.out.println(future.get());
        // }
        // catch(Exception e){
        // System.out.println(e);
        // }
        // if(future.isDone()){
        // System.out.println("Task Done");
        // }
        // executer.shutdown();

        // ExecutorService executer = Executors.newSingleThreadExecutor();
        // // Future<Integer> future = executer.submit(() -> 2 + 3);
        // Future<Integer> future= executer.submit(()->{
        //     try{
        //         Thread.sleep(2000);
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
        //     // System.out.println("Hello");
        //     return 2+3;
        // });
        // System.out.println(future.isDone());
        // // Integer i = future.get();
        // try{
        //     Integer i = future.get(2, TimeUnit.SECONDS); // If timeout then throw exception and don't return value
        //     System.out.println(i);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // // System.out.println(future.isDone());
        // // System.out.println(executer.isShutdown());
        // executer.shutdown();
        // System.out.println(executer.isShutdown());
        // Thread.sleep(10);
        // System.out.println(executer.isTerminated()); // sometimes true or false because of instantly executing before
                                                     // termination or after of executer.use sleep
                                                     // for correct output



        ExecutorService executer = Executors.newSingleThreadExecutor();
        Future<Integer> future= executer.submit(()->{
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Hello");
            return 2+3;
        });
        try{
            // Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        // future.cancel(true);
        future.cancel(false);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        executer.shutdown();
     
    }
}

// 1 isDone()
// Checks if the task is completed (normally or exceptionally).
//  Returns true if the task is completed.
//  Returns false if the task is still running.

// 2 isCancelled()
// Checks if the task was cancelled before completion.
// Returns true if the task was cancelled.
// Returns false if it was not cancelled.

// 3️ get()
// Retrieves the task result. Blocks until the task completes.
// Waits until the task finishes.

// 4️ get(long timeout, TimeUnit unit)
// Waits for a limited time, throws TimeoutException if time expires.
// If the task completes within 3 seconds, it returns the result.
// If not, throws TimeoutException.

// 5️ cancel(boolean mayInterruptIfRunning)
// Cancels the task if possible.
// If the task was successfully cancelled, it returns true.
// If the task was already completed, it returns false.
// 🔹 true parameter tries to interrupt the running task.
// 🔹 false parameter does not interrupt but prevents execution if not started.

// Method	                Description
// execute(Runnable)	    Executes a task asynchronously, but does not return a result.
// submit(Runnable)	        Executes a task asynchronously and returns a Future<?>.
// submit(Callable<T>)	    Executes a task asynchronously and returns a Future<T> with a result.
// shutdown()	            Initiates an orderly shutdown (no new tasks allowed, but existing tasks complete).
// shutdownNow()	        Attempts to immediately stop running tasks and discards pending tasks.
// awaitTermination	        Waits for some time for tasks to complete before forcing shutdown.
// (timeout, unit)
// isShutdown()	            Returns true if shutdown() or shutdownNow() has been called.
// isTerminated()	        Returns true if all tasks have finished executing.


// Method	                Returns	                 Blocks?	                    Exception
// isDone()	            true if completed, 	          ❌ No	                        ❌ No
//                         else false
// isCancelled()	        true if cancelled,	       ❌ No	                        ❌ No
//                         else false
// get()	                Task result	            ✅ Yes 	                    ❗ExecutionException, 
//                                                 (until task completes)           InterruptedException
// get(timeout, unit)	    Task result 	        ✅ Yes (up to timeout)	    ❗TimeoutException, ExecutionException
//                                                                                  ,InterruptedException
//                          (if within timeout)
// cancel(true/false)	    true if 	                ❌ No	                 ❗ CancellationException when using 
//                         cancelled successfully                                   get() after cancellation