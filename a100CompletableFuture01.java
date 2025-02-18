import java.util.concurrent.CompletableFuture;

// CompletableFuture is part of Java's java.util.concurrent package and
// is used for asynchronous programming. It allows running tasks in 
// parallel without blocking the main thread.

// 1 Why Use CompletableFuture?
//  Runs tasks asynchronously (without blocking).
//  Handles callback chaining (thenApply, thenAccept).
//  Combines multiple async tasks (thenCombine, allOf).
//  Handles exceptions easily (exceptionally, handle).

public class a100CompletableFuture01 {
    public static void main(String[] args) {
        // runAsync() executes a task without returning a result.
        
        // by default completablefuture is daemon thread
        // that's why only main thread executed if we 
        // don't use join or get with sleep, before sleep if something is there
        // then it will be executed by completablefuture thread
        CompletableFuture<Void> completableFuture= CompletableFuture.runAsync(()->{
            System.out.println("Working thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // completableFuture.join();
        System.out.println("Main thread");
    }
}
