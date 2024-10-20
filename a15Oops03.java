// Polymorphism

class Animal{
    public void makeSound(){
        System.out.println("Some sound");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bohhh");
    }
}
public class a15Oops03 {
    public static void main(String[] args){
        Animal myCat=new Cat();
        myCat.makeSound();
        Animal myDog=new Dog();
        myDog.makeSound();
    }
}
