// Abstraction

abstract class Animal{
    abstract public void makeSound();
    public void sleep(){
        System.out.println("Sleeping");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Boooh");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meoww");
    }
}
public class a16Oops04 {
    public static void main(String[] args){
        Animal dog1=new Dog();
        dog1.makeSound();
        Animal cat1=new Cat();
        cat1.makeSound();
        dog1.sleep();
        cat1.sleep();
    }
}
