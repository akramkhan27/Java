// yield(): Pauses the current thread to give other threads a chance to execute.

class Test extends Thread{
    public Test(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
public class a71Multithreading {
    public static void main(String[] args) {
        Test t1=new Test("Me");
        Test t2=new Test("You");

        t1.start();
        t2.start();
    }
}
