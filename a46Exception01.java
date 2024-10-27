// An exception is an unwanted or unexpected event that disrupts the 
// normal flow of a program. Exceptions are errors that occur at runtime. 
// Java provides a robust framework for handling exceptions to prevent programs from crashing.

// every class extends by default Object class
// toString() is present in Object class which return class name and hexCode of the current class instance
// we can override it also

// toString() implementation for ArithmeticException class is present in Throwable Class

// class School extends Object{
class School{
    int id ;
    String name;
    public School(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString(){
        return String.valueOf("The Id : "+id);
    }
}
public class a46Exception01 {
    public static void main(String[] args) {
        School s1=new School(100, "Akram");
        System.out.println(s1);
        int[] numerators={10,20,40,100};
        int[] denominators={2,5,0,10};
        for(int i=0;i<numerators.length; i++){
            System.out.println(a46Exception01.divide(numerators[i], denominators[i]));
        }
        System.out.println("Thank you");

    }
    public static int divide(int n1, int n2){
        // return n1/n2; // Runtime error : Exception in thread "main" java.lang.ArithmeticException: / by zero
        try{
            return n1/n2;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            return -1;
        }
    }
}
