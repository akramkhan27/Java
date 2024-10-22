// Runtime Polymorphism
// Method Overriding (which is possible with inheritance) and at the time of object 
// creation parent type reference and object creation type should be child
// - At runtime JVM decide which method has to be execute --> also known as Dynamic method Dispatch

class Animal{
    String name;
    int age;
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
    
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sayHello(){
        System.out.println("");
    }
}
class Dog extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Wooh!");
    } 
    public void sayBye(){
        System.out.println("Wooh Wooh!");
    }
}
class Cat extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Meow!");
    }
}
public class a30Polymorphism02 {
    public static void main(String[] args){
        // Animal a1=new Animal();
        // a1.sayHello();

        // Dog d1=new Dog();
        // d1.sayHello();

        // Cat c1=new Cat();
        // c1.sayHello();

        // Runtime Polymorphism
        Animal d1= new Dog(); // Upcasting-> Lower Hierarchical(Child Class) Object is refer By Upper Hierarchical(Parent class) reference type
        d1.sayHello();
        // d1.sayBye(); // when reference type is parent then only parent fields & methods present in parent only accessible nut not the Dog

        // Downcasting e.g

        double a=5.5432;
        int b= (int) a;

        Dog d2= (Dog) d1;
        d2.sayHello();


    }
}
