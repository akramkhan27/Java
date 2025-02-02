// Lambda Expressions in Java
// A Lambda Expression is a concise way to represent a functional interface 
// (an interface with a single abstract method) in Java. It simplifies code, 
// especially for functional-style programming, by eliminating boilerplate 
// code for anonymous inner classes.

public class a85LambdaExpression01 {
    public static void main(String[] args) {
        // Runnbale class is FUncational Interface it has only one abstract method
        // Without Lambda Expression
        // Runnable runnable=new Runnable(){
        // @Override
        // public void run(){
        // System.out.println("Hello world");
        // }
        // };
        // Thread t1= new Thread(runnable);
        // t1.start();

        // Using Lambda Expression
        Runnable runnable = () -> {
            System.out.println("Hello world");
        };
        Thread t1 = new Thread(runnable);
        t1.start();

    }
}
