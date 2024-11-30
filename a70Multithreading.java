// interrupt() Method in Java

// The interrupt() method in Java is used to signal a thread to stop or pause 
// its current execution. It doesn’t forcefully stop a thread; instead, it sets 
// the thread's interrupt status to true. The thread can then decide how to handle 
// this interruption, usually by checking its interrupted status and responding appropriately.

// Behavior:

// 1.If the thread is blocked (e.g., waiting or sleeping), the interruption 
// causes the thread to throw an InterruptedException.
// 2.If the thread is running, it does not stop immediately; 
// it just sets the thread's interrupted status to true.

class Test extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is running");

            }
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }
    }
}

public class a70Multithreading {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.start();
        try{
        Thread.sleep(2000);
        t1.interrupt();
        }
        catch(Exception e){
        System.out.println("Main thread was Interrupted");
        }
    }
}
