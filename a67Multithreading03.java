// Thread Lifecycle
// A thread goes through several states during its lifecycle:

// 1.New: Thread object is created.
// 2.Runnable: Thread is ready to run but waiting for CPU.
// 3.Running: Thread is executing.
// 4.Blocked: Thread is waiting for a resource.
// 5.Terminated: Thread has finished execution.

// extra info : running is not present in enum

class World extends Thread{
    @Override
    public void run(){
            // System.out.println(Thread.currentThread().getState()); // RUNNABLE or RUNNING

            System.out.println("RUNNING");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }

    }
}
public class a67Multithreading03{
    public static void main(String[] args) throws Exception{
        World t1=new World(); 
        System.out.println(t1.getState()); // NEW
        t1.start(); 
        System.out.println(t1.getState()); // RUNNABLE

        Thread.sleep(100);
        System.out.println(t1.getState()); // TIMED_WAITING
        t1.join();
        System.out.println(t1.getState()); // TERMINATED
    }
}
