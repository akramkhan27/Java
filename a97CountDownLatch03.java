import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// CountDownLatch with manual Thread

public class a97CountDownLatch03 {
    public static void main(String[] args) {
        int numberOfService=3;

        CountDownLatch countDownLatch= new CountDownLatch(numberOfService);
        for(int i=0;i<numberOfService;i++){
            new Thread(new DependentService(countDownLatch)).start();

        }
    
        try{
            // countDownLatch.await();
            countDownLatch.await(5,TimeUnit.SECONDS);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Other service started");
    }
}
class DependentService implements Runnable{
    final CountDownLatch latch;
    public DependentService(CountDownLatch latch){
        this.latch= latch;
    }
    @Override
    public void run(){
        try{
            // Thread.sleep(2000);
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName()+" Service Started");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            latch.countDown();
        }
    }
}
