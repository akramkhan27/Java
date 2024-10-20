// Inheritance

class Animal{
    String name;
    int age;
}
class Cat extends Animal{
    // String name;
    // int age;
    
    String breed;
}
public class a14Oops02 {
    public static void main(String[] args) {
        Cat cat1 =new Cat();
        cat1.name="Zeno";
        cat1.age=1;
        cat1.breed="Indian";

        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println(cat1.breed);
    }
}
