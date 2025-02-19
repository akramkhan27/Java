// volatile vs. Atomic in Java (Multithreading)
// Both volatile and Atomic variables help in thread-safe programming, 
// but they serve different purposes.

// volatile Keyword
//  Definition:
// volatile ensures that a variable's value is always read from main memory, 
// not from a thread's CPU cache.
// Prevents visibility issues in multithreading.

// Key Properties:
// ✔ Ensures visibility (latest value is always seen by all threads).
// ✔ Does NOT guarantee atomicity (operations like x++ are not thread-safe).
// ✔ Works best for flags (e.g., stopping a thread).

class SharedResource{
    // private boolean flag= false;
    private volatile boolean flag= false;

    public void setFlagTrue(){
        // volatile ensures that changes to running are immediately visible to all threads.
        flag=true;
        System.out.println("Flag has been set true");
    }
    public void printFlagIfTrue(){
        while(!flag){
            // do nothing
        }

        System.out.println("Flag is "+flag);
    }
}
public class a106AtomiVolatile01 {
    public static void main(String[] args) {
        SharedResource sharedResource= new SharedResource();

        Thread writer= new Thread(()->{
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            sharedResource.setFlagTrue();
        });
        Thread reader= new Thread(()->{
            sharedResource.printFlagIfTrue();
        });

        writer.start();
        reader.start();
    }
}
