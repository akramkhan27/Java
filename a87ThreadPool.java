public class a87ThreadPool {
    public static void main(String[] args) {
        // Thread Pool in Java
        // A Thread Pool is a group of pre-instantiated threads that can be reused 
        // to execute multiple tasks instead of creating new threads every time. 
        // It helps in optimizing performance by reusing threads and managing 
        // resource allocation efficiently.

        // Why Use a Thread Pool?
        // Creating and destroying threads frequently can be expensive in terms 
        // of memory and CPU. A thread pool solves this by: ✅ Reusing existing 
        // threads instead of creating new ones.
        // ✅ Limiting the number of threads to prevent excessive resource consumption.
        // ✅ Managing tasks efficiently using a queue.

        // How a Thread Pool Works?
        // A fixed number of threads are created at the start.
        // Tasks are submitted to the pool using an executor.
        // If a thread is free, it picks up a task and executes it.
        // Once the task is completed, the thread goes back to the pool for reuse.
    }
}
