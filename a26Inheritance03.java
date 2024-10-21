// Hierarchical Inheritance
// When more than one class inherits from the same parent class.

class Animal{
    private String name;
    private int age;
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
        System.out.println("Animal is eating food");
    }
    public void sayHello(){
        System.out.println("");
    }
    
}
class Dog extends Animal{
    // method overriding 

    // This below is called annotation
    // annotation gives some information of methods, fields or class, below annotation is Override
    // If a method is annotated with this annotation type, compilers are required to generate an error message
    // unless at least one of the following conditions hold:
    // The method does override or implement a method declared in a supertype.

    // @Override
    // public void sayHelloo(){ // error because not overriding
    //     System.out.println("Wohh!");
    // }

    @Override
    public void sayHello(){
        System.out.println("Wohh!");
    }

    // without @Override annotation then compiler give error and create another method without override
    // if we change the method name or signature
    // public void sayHello0(){
    //     System.out.println("Wohh!");
    // }

}
class Cat extends Animal{
    // method overriding
    public void sayHello(){
        System.out.println("Meow!");
    }
}
public class a26Inheritance03 {
    public static void main(String[] args){
        Dog d1=new Dog();
        Cat c1=new Cat();
        d1.setName("Bob");
        d1.setAge(2);

        c1.setName("Mikky");
        c1.setAge(5);

        System.out.println(d1.getName());
        System.out.println(d1.getAge());

        System.out.println(c1.getName());
        System.out.println(c1.getAge());
    }   
}
