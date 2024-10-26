// Abstract methods: Defined by default in interfaces, to be implemented 
// by any class implementing the interface.
// Default methods: Allow interfaces to have a method body, useful 
// for backward compatibility.
// Static methods: Provide utility methods relevant to the interface and 
// are accessible through the interface name.
// Variables: Static, final constants that cannot be changed.

interface Animal{
    // public abstract void sleep();
    // public abstract void eat();

    public static final int MAX_VAL=4323;
    void sleep();
    void eat();
    public static void info(){
        System.out.println("This is a Animal");
    }
    // void run(); error
    public default void run(){
        this.eat();
        System.out.println("Running...");
    }

}
class Dog implements Animal{
    @Override 
    public void sleep(){
        System.out.println("Dog is Sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}
class Cat implements Animal{
    @Override 
    public void sleep(){
        System.out.println("Cat is Sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
}
public class a36Interface01 {
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.sleep();
        d1.eat();
        // System.out.println(d1.MAX_VAL);
        System.out.println(Animal.MAX_VAL);
        Animal.info();
        Cat c1=new Cat();
        c1.sleep();
        c1.eat();

        d1.run();
        c1.run();

    }
}
