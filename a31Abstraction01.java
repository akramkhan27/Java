// abstract method always present in abstract class

abstract class Animal{
    private String name;
    private int age;
    private boolean isSuperPower;
    public String getName() {
        return name;
    }
    // public Animal(){ // public is not recommended because Animal class object not going be create in future that's why use protected
    //     this.isSuperPower=false;
    // }
    protected Animal(){ // public is not recommended because Animal class object not going be create in future that's why use protected
        this.isSuperPower=false;
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

    public abstract void sayHello();
    // protected abstract void sayHello();
    // abstract void sayHello(); // outside package not accessible then no class can extend Animal
    // private void sayHello(); // if we are making private then how we are going to override this method -> error
    public void eat(){
        System.out.println("Eating..");
    }
}

class Dog extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Woof!");
    }
}

class Cat extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Meow!");
    }
}
public class a31Abstraction01{
    public static void main(String[] arg){
        Dog d1=new Dog();
        d1.sayHello();
        Cat c1=new Cat();
        c1.sayHello();

        Animal d2=new Dog(); // it work in abstract because reference type of parent abstract class can be given
        d2.sayHello();
        // Animal a1=new Animal(); // but we cannot create object of abstract class
    }
}