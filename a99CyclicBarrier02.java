import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class a99CyclicBarrier02 {
    public static void main(String[] args) {
        int numberOfService=4;
        CyclicBarrier barrier= new CyclicBarrier(numberOfService, new Runnable() {
            @Override
            public void run(){
                System.out.println("All system are good and running. System startup complete.");
            }
        });
        ExecutorService executorService= Executors.newFixedThreadPool(numberOfService);
        executorService.submit(new SubSystem("Database", 3000, barrier));
        executorService.submit(new SubSystem("Web Server", 2000, barrier));
        executorService.submit(new SubSystem("Cache", 3000, barrier));
        executorService.submit(new SubSystem("Messaging Service", 3000, barrier));

        executorService.shutdown();
    }
}

class SubSystem implements Runnable{
    private CyclicBarrier barrier;
    private String name;
    private int initializationTime;
    public SubSystem(String name,int initializationTime, CyclicBarrier barrier){
        this.name=name;
        this.initializationTime=initializationTime;
        this.barrier=barrier;
    }

    @Override
    public void run (){
        try{
            System.out.println(name+ "initialization started");
            Thread.sleep(initializationTime);
            System.out.println(name+ "initialization complete");
            barrier.await();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}