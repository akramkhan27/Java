// single Inheritance
// When a class inherits from only one parent class
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
        System.out.println("Animal eat food");
    }
    public void sayHello(){
        System.out.println("");
    }
    
}
class Dog extends Animal{
    // method overriding
    public void  sayHello(){
        System.out.println("Woooh!");
    }
}
public class a24Inheritance01 {
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.setName("Mike");
        d1.setAge(2);
        d1.eat();
        d1.sayHello();
    }
}
