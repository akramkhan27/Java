// Thread Methods:

// start(): Starts a thread and invokes its run() method.
// run(): Contains the code executed by the thread.
// sleep(milliseconds): Puts the thread to sleep for a specified time.
// join(): Waits for a thread to die.
// setPriority(): It is used to assign a priority level to a thread.
// interrupt(): It is used to signal a thread to stop or pause its current execution.
// yield(): Pauses the current thread to give other threads a chance to execute.
// setDaemon(): is used to mark a thread as a daemon thread or a user thread.
// isAlive(): Checks if a thread is still running.

class Test extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class a68Multithreading {
    public static void main(String[] args) throws Exception{
        Test t1=new Test();
        t1.start();
        t1.join();
        System.out.println("Hello");
    }
}
