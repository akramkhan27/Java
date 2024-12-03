// Synchronization

// Synchronization in Threads
// When multiple threads share the same resource, synchronization 
// ensures that only one thread accesses the resource at a time.

class Counter{
    private int count=0;
    // public void increment(){
    //     count++;
    // }


    // In Java, the synchronized keyword and synchronized block are used 
    // to ensure thread safety when multiple threads access shared resources. 
    // Let's explore the differences, use cases, and provide examples for both.

    // 1. Synchronized Keyword
    // The synchronized keyword can be applied to methods.
    // It locks the entire method, ensuring that only one thread 
    // can execute it at a time for a given object.

    // public synchronized void increment(){
    //     count++;
    // }

    // 2. Synchronized Block
    // A synchronized block allows you to lock only a specific section of 
    // code, instead of the entire method.
    // It is more flexible and efficient as it minimizes the code that 
    // needs to be locked.
    
    public void increment(){
        synchronized(this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}

class Test extends Thread{
    private Counter counter;
    public Test(Counter counter){
        this.counter=counter;
    }
    
    @Override
    public void run(){
        for(int i=0;i<1000; i++){
            counter.increment();;
        }
    }
}
public class a73Synchronization {
    public static void main(String[] args) {
        Counter c1=new Counter();

        Test t1=new Test(c1);
        Test t2=new Test(c1);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(c1.getCount());
    }
}

// 1. How count++ Works Internally
// The statement count++ is not a single atomic operation. 
// It involves the following steps:

// Read: The thread reads the current value of count from memory.
// Increment: The thread calculates the new value by adding 1.
// Write: The thread writes the new value back to memory.
// These steps are not performed as a single, uninterrupted operation. 
// If two threads perform count++ at the same time, their operations 
// may overlap.

// 2. The Problem with Multiple Threads
// Let's say count is currently 5, and both t1 and t2 execute count++ 
// at the same time:

// Thread t1 reads count = 5.
// Thread t2 reads count = 5.
// Thread t1 increments its value to 6.
// Thread t2 increments its value to 6 (still based on the original 
// count it read).
// Thread t1 writes 6 to count.
// Thread t2 writes 6 to count.
// Even though both threads performed count++, the final value of 
// count is 6, not 7. This is called a race condition, where the 
// final value depends on the timing of thread execution.

// 3. Why the Final Value is Less than 2000
// When two threads run the increment() method concurrently:

// Due to race conditions, some increments are "lost."
// For example, if 50 increments are lost (due to overlaps), 
// the final value of count will be 1950 instead of 2000.
// 4. Why the Loop Always Runs 1000 Times
// The loop inside each thread (for (int i = 0; i < 1000; i++)) 
// always runs exactly 1000 times. However, the issue isn't with 
// the loop but with the shared resource count being updated 
// incorrectly when two threads modify it at the same time.