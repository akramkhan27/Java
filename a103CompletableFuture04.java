import java.util.concurrent.CompletableFuture;

// Combining Multiple CompletableFuture

// thenCombine() – Combining Results
// Combines results from two async tasks.

// allOf() – Waiting for Multiple Tasks
// allOf() waits for multiple tasks but does not return results.

public class a103CompletableFuture04 {
    // public static void main(String[] args) {
    //     CompletableFuture<Integer> future1= CompletableFuture.supplyAsync(()-> 10);
    //     CompletableFuture<Integer> future2= CompletableFuture.supplyAsync(()-> 20);

    //     CompletableFuture<Integer> completableFuture= future1.thenCombine(future2, (a,b)-> a+b);

    //     System.out.println(completableFuture.join());
    // }

    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()-> {
            System.out.println("Task 1");
            return "t1";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()-> {
            System.out.println("Task 2");
            return "t2";
        });

        CompletableFuture<Void> completableFuture= CompletableFuture.allOf(future1,future2);
        completableFuture.join();

        // System.out.println(future1.join());
        // System.out.println(future2.join());
    }
}
