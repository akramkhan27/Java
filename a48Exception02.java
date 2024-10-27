// Multiple catch block
// Polymorphism in Exception -> parents reference for handling multiple child Exception
// Handling Multiple exception in one catch
// IndexOutOfBoundsException
// NullPointerException

import java.io.IOException;

class Me{
    String name;
}
public class a48Exception02 {
    public static void main(String[] args) {
        int[] arr1={2,4,8,10};
        int[] arr2={2,2,0,4};
        // for(int i=0;i<arr1.length; i++){
        for(int i=0;i<=arr1.length; i++){
            try{
                System.out.println(a48Exception02.divide(arr1[i], arr2[i]));
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        System.out.println("Good Job");
    }
    public static int divide(int n1, int n2){
        try{
            Me m1=null;
            // System.out.println(m1.name);
            return n1/n2;

        }
        catch(ArithmeticException | NullPointerException e){
            System.out.println(e);
            return -1;
        }
        // catch(ArithmeticException | IOException e){ // error because of hierarichal mismatch
        //     System.out.println(e);
        //     return -1;
        // }
        
        // catch(ArithmeticException e){
        //     System.out.println(e);
        //     return -1;
        // }
        // catch(NullPointerException e){
        //     System.out.println(e);
        //     return -1;
        // }
        catch(Exception e){ // reference type of parent given here i.e Exception (polymorphism)
            System.out.println(e);
            return -1;
        }
    }
}
