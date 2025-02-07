// execute(Runnable command)
// Used to execute a Runnable task asynchronously.
// Does not return any result.
// Suitable for fire-and-forget tasks.

// submit(Callable<T> task) & submit(Runnable task)
// Unlike execute(), submit() returns a Future.
// submit(Runnable task) returns Future<?>, which does not return a result.
// submit(Callable<T> task) returns Future<T>, which allows retrieving results.

// shutdown()
// Initiates an orderly shutdown where previously submitted tasks are executed, but no new tasks are accepted.
// Already running tasks will finish execution, but new tasks will be rejected.

// shutdownNow()
// Forces shutdown by attempting to stop running tasks and discarding queued tasks.
// Returns a list of tasks that were waiting in the queue.
// Does not guarantee immediate termination.

// awaitTermination(long timeout, TimeUnit unit)
// Waits for a maximum of the given time for the executor to terminate.
// If time expires, it stops waiting.
// Should be called after shutdown().

// isShutdown() & isTerminated()
// isShutdown(): Returns true if shutdown() or shutdownNow() has been called.
// isTerminated(): Returns true only when all tasks are finished execution.

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;


public class a90ExecutorFrameWork03 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i < 10; i++) {
            final int finalI = i;
            executor.submit(() -> {
                System.out.println(factorial(finalI));
            });
        }

        // executor.shutdown();
        executor.shutdownNow();
        // try {
        //     executor.awaitTermination(4, TimeUnit.SECONDS);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // awaitTermination
        // * @return {@code true} if this executor terminated and
        // *         {@code false} if the timeout elapsed before termination
        // try {
        //     while(!executor.awaitTermination(100, TimeUnit.MILLISECONDS)){ // unlimited waiting until executor not terminated
        //         System.out.println("Waiting...");
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // long totalTime = System.currentTimeMillis() - startTime;
        // System.out.println("Total Time : "+totalTime);
    }

    public static int factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }
}
