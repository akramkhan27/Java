import java.util.concurrent.CompletableFuture;

// Chaining Tasks (thenApply, thenAccept)

// thenApply() – Transforms the result
// thenApply() modifies the result before passing it forward.

// thenAccept() – Consumes the result
// thenAccept() does not return a result, just processes it.

public class a102CompletableFuture03 {
    // public static void main(String[] args) {
    //     CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()-> "Hello").thenApply((result)-> result+" World");
    //     System.out.println(completableFuture.join());
    //     try{
    //         // System.out.println(completableFuture.get());
    //     }
    //     catch(Exception e){
    //         e.printStackTrace();
    //     }
    // }

    public static void main(String[] args) {
        CompletableFuture<Void> completableFuture= CompletableFuture.supplyAsync(()-> "Hello")
        .thenAccept((result)-> System.out.println(result));
    }
}
