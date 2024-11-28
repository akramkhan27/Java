// Multithreading in Java is a feature that allows a program 
// to perform multiple tasks simultaneously by dividing them into 
// smaller units of execution called threads. Each thread runs 
// independently, sharing the same memory space.

// There are two main ways to create threads in Java:

// 1. Extending the Thread Class

class World extends Thread{
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class a65Multithreading01 {
    public static void main(String[] args) {
        // System.out.println("World");
        World w1=new World();
        w1.start();
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
        
    }
}
