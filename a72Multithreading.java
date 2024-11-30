// setDaemon() Method in Java
// In Java, the setDaemon() method is used to mark a thread as a daemon 
// thread or a user thread. A daemon thread runs in the background and 
// provides support services to other threads, like garbage collection 
// or monitoring tasks. The JVM automatically terminates daemon threads 
// when all user threads finish execution.

class Test extends Thread{
    public Test(String name){
        super(name);
    }
    @Override
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class a72Multithreading {
    public static void main(String[] args) {
        Test t1=new Test("ME");
        // Test t2=new Test("You");

        t1.setDaemon(true);
        t1.start();
        // t2.start();
        System.out.println("Main Thread");
    }
}
