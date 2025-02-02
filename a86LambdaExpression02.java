// Understanding the Lambda Expression Inside Thread
// In Java, a Thread can be created in two ways:

// Extending the Thread class.
// Implementing the Runnable interface.
// Since Runnable is a functional interface 
// (i.e., it has only one abstract method, run()),
//  we can directly pass a Lambda Expression to the Thread 
//  constructor instead of creating a separate class or
//  an anonymous inner class.

// Thread Constructor Accepts a Runnable
// Thread thread = new Thread(...);
// The Thread class has a constructor that takes a Runnable as a parameter.
// Instead of creating a separate Runnable instance, we directly pass a Lambda Expression.

// () -> {
//     System.out.println("Thread is running using Lambda Expression");
// }
// This is a lambda expression that implements the Runnable interface.
// The Runnable interface has only one method: void run();, 
// so this lambda expression automatically provides its implementation.

public class a86LambdaExpression02 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("Hello World");
        });
        t1.start();
    }
}
