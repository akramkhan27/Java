// finally
// with return example
// The finally block executes even when there’s a return statement in the try block or catch block.
public class a54Exception08 {
    public static void main(String[] args) {
        // System.out.println(div(2,0));
        System.out.println(div(2,1));
    }
    public static int div(int n1,int n2){
        try{
            return n1/n2;
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }
        finally{
            System.out.println("Bye");
        }

    }
}
