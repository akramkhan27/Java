// final keyword 
// The final keyword in Java can be used with variables, methods, and classes:

// Final Variable: Its value cannot be changed once assigned.
// Final Method: Cannot be overridden by subclasses.
// Final Class: Cannot be subclassed.
// Using final helps in creating immutable variables and preventing 
// inheritance or method overriding where necessary.
class School{
    // private final int id=25;
    // public School(){
    //     id=10;  // error
    // }

    private final int id;
    public School(){
        id=10;
    }
}
// final class Vehical{
class Vehical{
    public final void airBag(){
        System.out.println("4 Air Bag");
    }
}
class EVcar extends Vehical { // error on extending if Vehical class is final
    // error
    // @Override
    // public void airBag(){
    //     System.out.println("2 Air Bag");
    // }
}
public class a35FinalKeyword {
    public static void main(String[] args) {
        
    }
}
