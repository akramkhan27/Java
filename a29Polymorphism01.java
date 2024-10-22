// compile time polymorphism
// At Compile time decide which method is going to be execute
// method overloading

class Calculator{

    public int addNum(int a, int b){
        return a+b;
    }
    public int addNum(int a, int b, int c){
        return a+b+c;
    }
    public double addNum(double a, double b){
        return a+b;
    }
}
public class a29Polymorphism01 {
    public static void main(String[] args){
        Calculator c1=new Calculator();
        System.out.println(c1.addNum(1,2));
        System.out.println(c1.addNum(1,2,3));
        System.out.println(c1.addNum(1.5,2.5));
    }
}
