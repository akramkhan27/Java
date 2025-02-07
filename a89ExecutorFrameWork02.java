import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

// Executor Framework in Java
// The Executor Framework in Java is a high-level API that provides a better way to 
// manage threads compared to manually creating and handling threads using the Thread 
// class. It simplifies thread management, scheduling, and resource utilization.

// Why Use the Executor Framework?
// 🔹 Manually managing threads can lead to complexity, performance issues, and resource leaks.
// 🔹 The Executor Framework provides thread pools, task scheduling, and lifecycle management.
// 🔹 It helps in handling concurrent tasks efficiently without excessive thread creation.

// Components of the Executor Framework
// The java.util.concurrent package provides the following key components:

// Executor
// The basic interface that allows task execution.

// ExecutorService
// Extends Executor and provides additional methods like shutdown() and submit().

// Executors
// A utility class that provides various factory methods to create thread pools.

// Callable & Future
// Callable<T> is similar to Runnable, but it returns a result.
// Future<T> is used to get the result of Callable.

// Executor has only execute() method, there is no shutdown.
// it is going to not stop until we stop manually
public class a89ExecutorFrameWork02 {
    public static void main(String[] args) {
        // long startTime= System.currentTimeMillis();
        Executor executor= Executors.newFixedThreadPool(10);
        for(int i=1;i<=10;i++){
            final int finalI=i;
            executor.execute(()->
            {
                System.out.println(factorial(finalI));
            });
            
        }
        // long totalTime= System.currentTimeMillis()-startTime;
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
