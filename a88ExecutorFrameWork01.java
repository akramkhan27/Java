public class a88ExecutorFrameWork01 {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        Thread[] threads=new Thread[10];
        for(int i=1;i<=10;i++){
            final int finalI= i;
            threads[i-1]=new Thread(()->{
                System.out.println(factorial(finalI));
            });
            threads[i-1].start();
        }
        for(Thread thread:threads){
            try{
                thread.join();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        long totalTime=System.currentTimeMillis()-startTime;
        System.out.println("Total Time : "+totalTime);
    }
    public static int factorial(int n){
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        int fact=1;
        for(int i=n; i>=1;i--){
            fact*=i;
        }
        return fact;
    }
}
