// Thread Communication in Java

// Thread communication allows multiple threads to communicate with 
// each other while working on shared resources. In Java, thread 
// communication is achieved using wait(), notify(), and notifyAll() 
// methods from the Object class.

// ------Key Points------
// wait():
// A thread calling wait() releases the lock and enters the waiting 
// state until it is notified by another thread.
// It must be called within a synchronized block/method.

// notify():
// Wakes up one thread that is waiting on the object's lock.

// notifyAll():
// Wakes up all threads waiting on the object's lock.

// Important Rules:
// These methods must be called within a synchronized block/method.
// The thread must hold the lock of the object before calling these methods.

class SharedResource{
    private int data;
    private boolean hasData;

    public synchronized void produce(int data){
        while(hasData){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        this.data=data;
        hasData=true;
        System.out.println("Produced "+data);
        notify();

    }

    public synchronized void consume(){
        while(!hasData){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        hasData=false;
        System.out.println("Consumed "+data);
        notify();
    }
}

class Producer implements Runnable{
    private SharedResource sharedResource;
    public Producer(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            sharedResource.produce(i);
        }
    }
}

class Consumer implements Runnable{
    private SharedResource sharedResource;
    public Consumer(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            sharedResource.consume();
        }
    }
}
public class a83ThreadCommunincation {
    public static void main(String[] args) {
        SharedResource resource= new SharedResource();

        Thread t1=new Thread(new Producer(resource), "Thread1");
        Thread t2=new Thread(new Consumer(resource), "Thread2");

        t1.start();
        t2.start();
    }
}

// How It Works
// Shared Resource:

// The producer writes data, and the consumer reads data from the shared resource.
// Producer:

// If hasData is true, the producer calls wait() and pauses until notified by the consumer.
// Consumer:

// If hasData is false, the consumer calls wait() and pauses until notified by the producer.
// notify():

// The producer notifies the consumer when it finishes producing data.
// The consumer notifies the producer when it finishes consuming data.

// What is Thread Safety in Java?
// Thread safety in Java ensures that shared data or resources are accessed correctly when 
// multiple threads are working concurrently. If a piece of code is thread-safe, it behaves 
// as expected even when accessed by multiple threads simultaneously without causing race 
// conditions, data inconsistency, or unexpected behavior.