import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Executors.newCachedThreadPool() creates a thread pool that dynamically 
// adjusts the number of threads based on workload. It reuses previously 
// created threads if available, or creates new threads as needed.

// Key Features of newCachedThreadPool()
//  Creates threads as needed – No limit on maximum threads.
//  Reuses idle threads – If a thread is available, it is reused instead of creating a new one.
//  Removes idle threads – Threads that remain idle for 60 seconds are removed to save resources.
//  Handles burst loads efficiently – Ideal for short-lived, unpredictable tasks.

// How newCachedThreadPool() Works?
// 1 A task is submitted using execute().
// 2 If an idle thread exists, it executes the task.
// 3 If no idle thread is available, a new thread is created.
// 4 If a thread remains idle for 60 seconds, it is removed to free resources.

// When to Use newCachedThreadPool()?
// Scenario	                                    Suitable?
// Many short-lived tasks	                    Yes
// Tasks with variable workloads	            Yes
// CPU-intensive tasks (e.g., calculations)	     No
// Fixed number of tasks	                     No (Use newFixedThreadPool() instead)

// Comparison with Other Thread Pools
// Method	                    Description
// newFixedThreadPool(n)	    Creates a fixed number of threads. Good for consistent workloads.
// newCachedThreadPool()	    Creates threads as needed, reuses idle ones. Good for bursty workloads.
// newSingleThreadExecutor()	Creates a single-threaded executor. Good for sequential execution.

public class a94ExecutorFrameWork07 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            final int taskID=i;
            executorService.submit(()->{
                System.out.println("Task id "+taskID+" is executed by "+Thread.currentThread().getName());
            });
        }
        executorService.shutdown();

    }
}
