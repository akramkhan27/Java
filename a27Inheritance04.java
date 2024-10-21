// super() 
// super() call the parent constructor from child constructor
// by default JVM write if not mention in child class constructor
// In Java, super() is used to call the constructor of the parent class (superclass) from the child class (subclass). 
// It allows the child class to inherit and initialize values from the parent class. 

// super can also be used in method (super.methodName) .
// super can be used to invoke super class constructor, methods and fields


class GrandParent{
    private String name;
    private int age;
    private boolean hasSuperPower;

    // public GrandParent(){
    //     hasSuperPower=false;
    //     System.out.println("I am GrandParent Constructor");
    // }
    public GrandParent(String name, int age){
        this.name=name;
        this.age=age;
        hasSuperPower=false;
        System.out.println("I am GrandParent Constructor");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean getHasSuperPower() {
        return hasSuperPower;
    }
    public void setHasSuperPower(boolean hasSuperPower) {
        this.hasSuperPower = hasSuperPower;
    }
    
    
}
class Parent extends GrandParent{
    public Parent(String name, int age){
        super(name, age); // grandparent class no default constructor present assume then super() will give error
        // super();
        System.out.println("I am Parent Constructor");
    }
    public void parentMethod(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    public Child(String name, int age){
        super(name,age); // becaus eof Parent want parameter error will show pass parameter
        // super(); // by default written by JVM
        System.out.println("I am Child Constructor");
        // super(); // error it can only written in first line of constructor while calling constructor
    }
    public void childMethod(){
        super.parentMethod();
        System.out.println("Child Method");
        // super.parentMethod(); // super while calling method can be written at any line of method
    }
}
public class a27Inheritance04 {
    public static void main(String[] args){
        // Child c1=new Child();
        // System.out.println(c1.getHasSuperPower());
        // c1.childMethod();

        // super() constructor with parameter calls
        Child c1=new Child("Habibul",90);
        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        // c1 object calls super constructor than this.name and this.age fields is 
        // Allocated for c1 object he was calling all constructor with the help of paramaterized super()
        // Then this.name and this.age is not belong to granparent object it belong to c1 (child)
        //  In Java, this keyword refers to the current object of the class.
        // And here current object is c1 of class Child

    }
}

