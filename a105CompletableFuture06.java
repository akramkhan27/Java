import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

// Running Tasks in Parallel (anyOf, allOf)

//  anyOf() – First Completed Task Wins
// Returns the first completed task.

// Delayed Execution with completeOnTimeout()

// If the task takes longer than 2 seconds, it returns "Default Value".

// Cancelling a CompletableFuture
// cancel() stops execution if the task is not yet completed.

public class a105CompletableFuture06 {
    // public static void main(String[] args) {
    //     CompletableFuture<String> future1= CompletableFuture.supplyAsync(()-> "Task 1");
    //     CompletableFuture<String> future2= CompletableFuture.supplyAsync(()-> "Task 2");

    //     CompletableFuture<Object> fastest= CompletableFuture.anyOf(future1,future2);

    //     System.out.println(fastest.join());
    // }

    // public static void main(String[] args) {
    //     CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()->{
    //         System.out.println("Worker Thread");
    //         try{
    //             Thread.sleep(5000);
    //         }
    //         catch(Exception e){
    //             System.out.println(e);
    //         }

    //         return "OK";
    //     }).completeOnTimeout("Failed", 6000, TimeUnit.MILLISECONDS);

    //     System.out.println(completableFuture.join());
    // }

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()->{
            System.out.println("Worker Thread");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return "OK";
        });
        completableFuture.cancel(true);
        System.out.println(completableFuture.isCancelled());
        System.out.println(completableFuture.join());
    }
}

// Method	
// Description
// runAsync(Runnable)	
// Runs a task asynchronously (no return).
// supplyAsync(Supplier<T>)	
// Runs a task asynchronously and returns a result.
// thenApply(Function<T, R>)	
// Transforms the result.
// thenAccept(Consumer<T>)	
// Consumes the result (no return).
// thenCombine(CompletableFuture, BiFunction)	
// Combines two results.
// allOf(CompletableFuture…)	
// Waits for all tasks to complete.
// anyOf(CompletableFuture…)	
// Returns the first completed task.
// exceptionally(Function<Throwable, T>)	
// Handles exceptions and provides default value.
// handle(BiFunction<T, Throwable, R>)	
// Handles success & failure cases.
// completeOnTimeout(T, timeout, TimeUnit)	
// Provides a default value if the task is too slow.
// cancel(boolean)	
// Cancels execution.