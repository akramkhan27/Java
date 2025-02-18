import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

// Handling Exceptions (exceptionally, handle)

// exceptionally() – Handling Errors
// exceptionally() catches exceptions and provides a default value.

// handle() – Handles Success & Failure
// handle() handles both success and failure cases.

public class a104CompletableFuture05 {
    // public static void main(String[] args) {
    //     CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()->{
    //         try{
    //             Thread.sleep(5000);
    //         }
    //         catch(Exception e){
    //             e.printStackTrace();
    //         }
    //         System.out.println("Worker Thread");
    //         return "OK";
    //     }).orTimeout(2000, TimeUnit.MILLISECONDS).exceptionally((exception)-> "exception occurred "+ exception.getMessage());

    //     System.out.println(completableFuture.join());
    // }

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture= CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Worker Thread");
            return "OK";
        }).orTimeout(6000, TimeUnit.MILLISECONDS).handle((result, exception)->{
            // System.out.println(exception);
            if(exception!=null){
                return "Exception Ocurred "+ exception.getMessage();
            }
            return result;
        });

        System.out.println(completableFuture.join());
    }
}
