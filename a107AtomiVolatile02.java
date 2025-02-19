import java.util.concurrent.atomic.AtomicInteger;

// Atomic Variables (AtomicInteger, AtomicLong, etc.)
//  Definition:
// java.util.concurrent.atomic package provides atomic operations for primitive types.
// Uses CAS (Compare-And-Swap) mechanism for thread-safe operations.
//  Key Properties:
// ✔ Ensures both visibility and atomicity.
// ✔ Supports thread-safe operations like incrementAndGet(), decrementAndGet().
// ✔ Preferred for counters, accumulators, and shared state updates.

// here we can also use synchronized or locks but going to use Atomic Variables

// AtomicInteger ensures safe increments without locks.
class VolatileCounter{
    private AtomicInteger counter= new AtomicInteger(0);

    public void incrementCounter(){
        counter.incrementAndGet();
    }
    public int getCounter(){
        return counter.get();
    }

}
public class a107AtomiVolatile02 {
    public static void main(String[] args) {
        VolatileCounter volatileCounter= new VolatileCounter();
        
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                volatileCounter.incrementCounter();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                volatileCounter.incrementCounter();
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(volatileCounter.getCounter());


    }
}

// volatile vs. Atomic – Key Differences
// Feature	                    volatile	                    Atomic (AtomicInteger, etc.)
// Ensures Visibility	        Yes	                            Yes    
// Ensures Atomicity	        No	                            Yes
// Thread-safe	            Only for single writes & reads	    Fully thread-safe
// Best for	                Flags (e.g., running variable)	    Counters, accumulators
// Operations Supported	    Read/Write only	                    Increment, Decrement, Compare-And-Swap
// Performance	            Faster, but limited	                Slightly slower, but safer