package testZoo;
// protected in different package

import zoo.Dog;

public class test {
    public static void main(String[] args) {
        Dog d1=new Dog("Bob");
        d1.makeSound();
        d1.wagTail();
//        d1.changeSound("Meow!!"); // error because of protected
        d1.setDogSound("Boooh!");
        d1.makeSound();
    }
}
