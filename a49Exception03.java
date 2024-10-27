// stack trace

// A stack trace is a report of the active stack frames at a specific point in time during 
// program execution, usually when an exception occurs. It shows 
// the sequence of method calls that led to the exception, helping developers 
// trace the exact point and flow in the code where an error happened.
public class a49Exception03 {
    public static void main(String[] args) {
        levelA();
    }
    public static void levelA(){
        levelB();
    }
    public static void levelB(){
        // int arr[]={1,2,3,4,5};
        // System.out.println(arr[5]);
        try{
            int arr[]={1,2,3,4,5};
            System.out.println(arr[5]);
        }
        catch(Exception e){
            // StackTraceElement[] straceElement= e.getStackTrace();
            // for(StackTraceElement stackElement: straceElement){
            //     System.out.println(stackElement);
            // }
            e.printStackTrace();
            System.out.println("Hello");
        }
    }
}
