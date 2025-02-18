import java.util.concurrent.CompletableFuture;

// If you need a result from an async task, use supplyAsync()
// supplyAsync() returns a value (not void).
public class a101CompletableFuture02 {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()->{
            System.out.println("Worker Thread");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return "Ok";
        });
        System.out.println(completableFuture.getNow("Not")); // getNow dont wait for completableFuture thread that's why actual result not come
        // System.out.println(completableFuture.join());
        try{
            // System.out.println(completableFuture.get());
            // join (unchecked exception return) and get both give result value of thread
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Main Thread");
    }
}
