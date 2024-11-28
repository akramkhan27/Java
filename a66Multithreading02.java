// 2. Implementing the Runnable Interface

class World implements Runnable{
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class a66Multithreading02 {
    public static void main(String[] args) {
        World w1=new World();
        Thread t1=new Thread(w1);
        t1.start();

        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
