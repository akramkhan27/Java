// Recursion->
// Recursion in Java is when a method calls itself. 
// It continues to call itself until it reaches a base case
// to prevent an infinite loop.

public class a18Recursion{
    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(sumOfNatural(6));
    }
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        // 5!
        // 5*4*3*2*1
        // 5!=5*4!
        return num*factorial(num-1);
    }
    public static int sumOfNatural(int num){
        if(num==1){
            return 1;
        }
        // 5
        // 5+4+3+2+1
        // 5+(n-1)
        return num+sumOfNatural(num-1);
    }
}